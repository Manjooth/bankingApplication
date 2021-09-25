/* (C)2021 */
package com.banking.bankingApplication.repositories;

import com.banking.bankingApplication.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {}
