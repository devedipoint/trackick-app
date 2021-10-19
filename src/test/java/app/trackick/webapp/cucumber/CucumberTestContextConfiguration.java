package app.trackick.webapp.cucumber;

import app.trackick.webapp.TrackickApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = TrackickApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
