package com.antra.evaluation.reporting_system;

import static org.assertj.core.api.Assertions.assertThat;

import com.antra.evaluation.reporting_system.endpoint.ExcelGenerationController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private ExcelGenerationController excelGenerationController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(excelGenerationController).isNotNull();
    }
}