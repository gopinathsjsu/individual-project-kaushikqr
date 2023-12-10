package com.cmpe202.individualproject.reader;

import com.cmpe202.individualproject.main.CreditCardEntry;

import java.util.List;

public interface Reader {

    // Read the file and return a list of CreditCardEntry objects
    List<CreditCardEntry> readFile(String inputFile);
    // TODO Auto-generated method stub

}
