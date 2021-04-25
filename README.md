# Test Automation Framework for BDD Environment 
Test automation framework that works well with BDD environment. It generates Cluecumber report for every test execution. It support multiple browser selection and parallel testing.


## Execution Triggers
The test can be triggerws with the following commands:
```bash
mvn test 
```

Specified tests can be triggered with following commands:
```bash
mvn test -Dcucumber.options="--tags @smoke"
```

Specified test with specified browser can be triggered with the following commands:
```bash
mvn test -Dcucumber.options="--tags @smoke" -Dbrowser="chrome"
```

Supported Browser:
| Browser         |Options String         |
|-----------------------------------------|
| Google Chrome   | `-Dbrowser="chrome"`  |
| Mozilla Firefox | `-Dbrowser="firefox"` |
| MS Edge         | `-Dbrowser="edge"`    |


### Generating the Report


