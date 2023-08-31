package com.springboot.walletservice.repository;

import com.springboot.walletservice.model.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<WalletEntity,Long> {
}
