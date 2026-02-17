package mybank.util;

import mybank.entities.Account;

import java.util.Comparator;

public class AccountEntityComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Account && o2 instanceof Account){
            Account account1 = (Account)o1;
            Account account2 = (Account)o2;
            if(account1.getAccId() < account2.getAccId()){
                return -1;
            }else  if(account1.getAccId() > account2.getAccId()){
                return 1;
            }
        }else if(o1 instanceof Account ){
            return -1;
        }
        return 0;
    }
}
