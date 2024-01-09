package com.example.repository;

import com.example.repository.packaze.PackageEntity;
import com.example.repository.packaze.PackageRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Slf4j
@SpringBootTest
@ActiveProfiles("test")
public class PackageRepositoryTest {

    @Autowired
    private PackageRepository packageRepository;

    @Test
    void test_save() {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setPackageName("바디 챌린지 PT 12주");
        packageEntity.setPeriod(84);

        packageRepository.save(packageEntity);

        Assertions.assertNotNull(packageEntity.getPackageSeq());
    }
}
