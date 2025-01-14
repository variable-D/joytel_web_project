package com.prepia.repository;

import com.prepia.domain.SftpData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SftpDataRepository extends JpaRepository<SftpData, Long> {
}
