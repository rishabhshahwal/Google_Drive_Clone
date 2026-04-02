package com.ris.Drive_Backend.services;

import com.ris.Drive_Backend.entity.FileEntity;
import com.ris.Drive_Backend.repo.FileRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.StandardReflectionParameterNameDiscoverer;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileServiceStorage {

    @Value("${file.upload-dir}")
    private String uploadDir;

    private final FileRepository fileRepository;

    public FileServiceStorage(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public String saveFile(MultipartFile file,Long parentFolderId) throws IOException {
       Path uploadPath = Paths.get(uploadDir);
               if(!Files.exists(uploadPath))
               {
                   Files.createDirectories(uploadPath);
               }

               //filename
              String filename=file.getOriginalFilename();
               Path filepath=uploadPath.resolve(filename);
               Files.copy(file.getInputStream(),filepath, StandardCopyOption.REPLACE_EXISTING);

               //meta data for DB
        FileEntity fileEntity=new FileEntity();
        fileEntity.setName(filename);
        fileEntity.setPath(filepath.toString());
        fileEntity.setSize(file.getSize());
        fileEntity.setType("file");
        fileEntity.setParentFolderId(parentFolderId);
        fileEntity.setCreatedAt(LocalDateTime.now());

        fileRepository.save(fileEntity);

        return "File uploaded Successfully!";

       /*
       * place upload logic in try catch and handle exception it occur*/
    }

    public List<FileEntity> getFilesInFolder(Long parentFolderId)
    {
        if (parentFolderId==null)
        {
            return fileRepository.findAll()
                    .stream()
                    .filter(f->f.getParentFolderId()==null)
                    .collect(Collectors.toList());
        }

        else{
            return fileRepository.findAll()
                    .stream()
                    .filter(f->parentFolderId.equals(f.getParentFolderId()))
                    .collect(Collectors.toList());

        }
    }


    public FileEntity getFileById(Long id)
    {
        return fileRepository.findById(id).orElseThrow(()->new RuntimeException("File not found"));
    }

    public void deleteById(Long id)
    {
        fileRepository.deleteById(id);
    }
}
