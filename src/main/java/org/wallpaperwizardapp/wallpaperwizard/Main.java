package org.wallpaperwizardapp.wallpaperwizard;

import org.wallpaperwizardapp.wallpaperwizard.exceptions.PathDoesNotExistException;
import org.wallpaperwizardapp.wallpaperwizard.model.Wallpaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("[Main] Wallpaper Wizard Started");

        Path imagePath = Paths.get("C:\\Users\\isaac\\Pictures\\Cars Theme\\Leclerc2021Turkish.jpg");
        //Path imagePath = Paths.get("C:\\Users\\isaac\\Pictures\\Cars Theme\\Leclerc2022Monza.jpg");


        Wallpaper wallpaper = new Wallpaper();
        try {
            wallpaper.setWallpaper(imagePath);
        } catch (PathDoesNotExistException e) {
            e.printStackTrace();
        }

    }
}