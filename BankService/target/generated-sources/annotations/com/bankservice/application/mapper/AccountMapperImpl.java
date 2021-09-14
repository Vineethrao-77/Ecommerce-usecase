package com.bankservice.application.mapper;

import com.bankservice.application.dto.AccountDTO;
import com.bankservice.application.model.Account;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-14T20:42:25+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1300.v20210419-1022, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public Account mapToAccount(AccountDTO request) {
        if ( request == null ) {
            return null;
        }

        Account account = new Account();

        account.setAccountType( request.getAccountType() );
        account.setBankName( request.getBankName() );
        account.setBranchName( request.getBranchName() );
        account.setCustomerId( request.getCustomerId() );
        account.setIfsCode( request.getIfsCode() );

        account.setAvailableBalance( Double.valueOf(request.getOpeningDeposit()) );
        account.setAccountNo( numbGen() );

        return account;
    }
}
