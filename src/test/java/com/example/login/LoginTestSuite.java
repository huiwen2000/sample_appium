package com.example.login;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeClassNamePatterns(".*loginTest.*")
public class LoginTestSuite {
}

//run command
//mvn -Dtest=com.example.login.LoginTestSuite test
