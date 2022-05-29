package com.maayanpolitzer.shop.controllers;

import com.maayanpolitzer.shop.models.requests.FileRequest;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.util.Base64;

@RestController
@RequestMapping("/files")
public class FilesController {

    /**
     * we have two options in upload files to the server:
     * 1. In the client side: convert the file to a string (base64) and send it in the json body.
     * 2. In the client side: upload the file as multipart request as form data body.
     * @return
     */
    @PostMapping
    public ResponseEntity uploadFile(
            @Valid @RequestBody FileRequest request
            ){
        // 1. save the string as file.
        byte[] fileBytes = Base64.getDecoder().decode(request.getFile());

        /*
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("tempImage2.jpg");
            out.write(fileBytes);
            return new ResponseEntity(HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: 29/05/2022 NO AVAILABLE SPACE TO SAVE THE FILE - SEND EMAIL.
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        } finally {
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        */

        try(
                FileOutputStream out2 = new FileOutputStream("tempImage.jpg")
        ){
            out2.write(fileBytes);
            return new ResponseEntity(HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: 29/05/2022 NO AVAILABLE SPACE TO SAVE THE FILE - SEND EMAIL.
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/2")
    public ResponseEntity uploadFile2(
            @RequestParam("file") MultipartFile request    // as form data body.
            ){
        try(
                FileOutputStream out = new FileOutputStream("tempImage3.jpg");
                InputStream in = request.getInputStream()
                ){
            int actuallyRead;
            byte[] buffer = new byte[1024];
            while((actuallyRead = in.read(buffer)) != -1){
                out.write(buffer, 0, actuallyRead);
            }
            return new ResponseEntity(HttpStatus.CREATED);
        }catch(IOException e){
            e.printStackTrace();
            // TODO: 29/05/2022 NO AVAILABLE SPACE TO SAVE THE FILE - SEND EMAIL.
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{filename}")
    public void downloadFile(
            @PathVariable String filename,
            HttpServletResponse response
    ){
        File file = new File(filename);
        try(
                OutputStream out = response.getOutputStream();
                InputStream in = new FileInputStream(file)
        ){
            int actuallyRead;
            byte[] buffer = new byte[1024];
            response.addHeader("Content-Type", "image/jpg");    // application/pdf

            while((actuallyRead = in.read(buffer)) != -1){
                out.write(buffer, 0, actuallyRead);
            }

            // SERVING HTML FILES (for advanced features, read about thymeleaf library):
//            response.addHeader("Content-Type", "text/html");
//            String content = "<html><head><title>hi from maayan</title></head><body><h1>wow</h1></body></html>";
//            byte[] bytes = content.getBytes();
//            out.write(bytes);
        }catch(IOException e){
            e.printStackTrace();
            // TODO: 29/05/2022 NO AVAILABLE SPACE TO SAVE THE FILE - SEND EMAIL.
        }
    }


}
