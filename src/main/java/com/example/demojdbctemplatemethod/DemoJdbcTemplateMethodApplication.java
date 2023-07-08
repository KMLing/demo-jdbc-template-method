package com.example.demojdbctemplatemethod;

import com.example.demojdbctemplatemethod.service.EmployeeReportService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJdbcTemplateMethodApplication implements CommandLineRunner {

    private final EmployeeReportService employeeReportService;

    public DemoJdbcTemplateMethodApplication(EmployeeReportService employeeReportService) {
        this.employeeReportService = employeeReportService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoJdbcTemplateMethodApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeReportService.printReport();
    }
}
