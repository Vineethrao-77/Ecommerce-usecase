package com.bankservice.application.mapper;

import com.bankservice.application.dto.FundTransferDto;
import com.bankservice.application.model.Account;
import com.bankservice.application.model.Transaction;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-14T20:41:51+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1300.v20210419-1022, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class FundTransferMapperImpl implements FundTransferMapper {

    @Override
    public Transaction mapToTransaction(FundTransferDto fundTransDto, Account account) {
        if ( fundTransDto == null && account == null ) {
            return null;
        }

        Transaction transaction = new Transaction();

        if ( fundTransDto != null ) {
            transaction.setRemarks( fundTransDto.getRemarks() );
        }
        if ( account != null ) {
            transaction.setAccount( account );
        }
        transaction.setAmount( Double.valueOf(fundTransDto.getTransferAmount()) );
        transaction.setFromAccount( Long.valueOf(fundTransDto.getFromAccountNo()) );
        transaction.setToAccount( Long.valueOf(fundTransDto.getToAccountNo()) );

        return transaction;
    }

    @Override
    public Account mapToAccount(FundTransferDto fundTransDto, Account account) {
        if ( fundTransDto == null && account == null ) {
            return null;
        }

        Account account1 = new Account();

        if ( account != null ) {
            account1.setAccountId( account.getAccountId() );
            account1.setAccountNo( account.getAccountNo() );
            account1.setAccountType( account.getAccountType() );
            account1.setBankName( account.getBankName() );
            account1.setBranchName( account.getBranchName() );
            account1.setCustomerId( account.getCustomerId() );
            account1.setIfsCode( account.getIfsCode() );
        }
        account1.setAvailableBalance( account.getAvailableBalance()-Double.valueOf(fundTransDto.getTransferAmount()) );

        return account1;
    }
}
