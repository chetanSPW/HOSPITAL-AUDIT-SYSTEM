package com.spw.field_Investigation_system.repository;

import com.spw.field_Investigation_system.entity.MasterTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MasterTableRepository extends JpaRepository<MasterTable, UUID> {
}
