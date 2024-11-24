package com.example.strava;

import com.example.strava.service.UserService;
import com.example.strava.service.TrainingService;
import com.example.strava.entity.User;
import com.example.strava.service.ChallengeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Configuration
public class DataInitializer {
	//gora euskadi
    private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Bean
    CommandLineRunner initData(UserService userService, TrainingService trainingService, ChallengeService challengeService) {
        return args -> {
//            Date currentDate = new Date();
//            // Crear usuarios iniciales con conversión de fecha de nacimiento
//            try {
//            	userService.registerUser("johndoe@example.com", "pswrd", "John Doe", dateFormat.parse("1990-01-01"), 75, 175, 190f, 60f);
//                userService.registerUser("janesmith@example.com", "pswrd", "Jane Smith", dateFormat.parse("1992-05-15"), 65, 165, 180f, 55f);
//                userService.registerUser("alicej@example.com", "pswrd", "Alice Johnson", dateFormat.parse("1988-08-20"), 70, 168, 185f, 58f);
//                logger.info("Usuarios iniciales guardados!");
//            } catch (ParseException e) {
//                logger.error("Error al parsear fechas de nacimiento: ", e);
//            } catch (Exception e) {
//                logger.error("Error al registrar usuarios iniciales: ", e);
//            }
//            String token = null;
//            // Crear sesiones de entrenamiento
//            try {
//            	token = userService.login("johndoe@example.com", "pswrd");
//            	User jhon = UserService.activeSessions.get(token);
//                trainingService.session(jhon.getUserId(), token, "Morning Run", "Running", 5.0f, currentDate, 2.5f);
//                trainingService.session(jhon.getUserId(), token, "Evening Cycle", "Cycling", 20.0f, currentDate, 4f);
//                trainingService.session(jhon.getUserId(), token, "Swimming Session", "Swimming", 1.5f, currentDate, 1f);
//                logger.info("Sesiones de entrenamiento iniciales guardadas!");
//            } catch (Exception e) {
//                logger.error("Error al crear sesiones de entrenamiento: ", e);
//            }
//
//            // Establecer fecha de fin para desafíos (7 días a partir de hoy)
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(currentDate);
//            calendar.add(Calendar.DAY_OF_MONTH, 7);
//            Date challengeEndDate = calendar.getTime();
//
//            
//
//            // Crear desafíos iniciales
//            try {
//            	User jhon = UserService.activeSessions.get(token);
//                challengeService.challenge(jhon.getUserId(), token, "RunningTrip", currentDate, challengeEndDate, 60, 10.0f, "Running");
//            } catch (Exception e) {
//                logger.error("Error al crear desafíos: ", e);
//            }
        };
    }
}
