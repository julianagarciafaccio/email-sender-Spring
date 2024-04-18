package com.julianaDev.email.repositories;

import com.julianaDev.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel , Long> {
}
