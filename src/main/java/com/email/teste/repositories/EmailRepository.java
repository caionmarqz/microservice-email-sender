package com.email.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.teste.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
