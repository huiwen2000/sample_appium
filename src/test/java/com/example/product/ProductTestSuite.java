package com.example.login;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeClassNamePatterns(".*productTest.*")
public class ProductTestSuite {
}

//run command
//mvn -Dtest=com.example.product.ProductTestSuite test
