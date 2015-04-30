Minimization of problem. It was tested running with:

    mvn clean install && mvn scoverage:report
    mvn sonar:sonar -Dsonar.jdbc.url=XXX -Dsonar.jdbc.username=XXX -Dsonar.jdbc.password=XXX -Dsonar.login=XXX -Dsonar.password=XXX -Dsonar.host.url=XXX

And the result below -- grep for "File not found".

```
Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=200m; support was removed in 8.0
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building sonar-test master-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- sonar-maven-plugin:2.5:sonar (default-cli) @ sonar-test ---
[INFO] SonarQube version: 5.1
INFO: Default locale: "en_US", source code encoding: "UTF-8" (analysis is platform dependent)
INFO: Work directory: /Users/dsobral/src/sonar-test/target/sonar
INFO: SonarQube Server 5.1
[INFO] [16:24:29.517] Load global repositories
[INFO] [16:24:30.000] Load global repositories (done) | time=487ms
[INFO] [16:24:30.003] Server id: 20150429172408
[INFO] [16:24:30.005] User cache: /Users/dsobral/.sonar/cache
[INFO] [16:24:30.016] Install plugins
[INFO] [16:24:30.279] Install JDBC driver
[INFO] [16:24:30.330] Create JDBC datasource for XXX
[INFO] [16:24:32.413] Initializing Hibernate
[INFO] [16:24:34.688] Load project repositories
[INFO] [16:24:35.151] Load project repositories (done) | time=463ms
[INFO] [16:24:35.151] Load project settings
[INFO] [16:24:35.510] Load technical debt model
[INFO] [16:24:35.635] Apply project exclusions
[INFO] [16:24:36.403] -------------  Scan sonar-test
[INFO] [16:24:36.406] Load module settings
[INFO] [16:24:36.669] Load rules
[INFO] [16:24:39.731] Excluded sources for coverage:
[INFO] [16:24:39.731]   file:**/generated-sources/**
[INFO] [16:24:39.757] Initializer FindbugsMavenInitializer
[INFO] [16:24:39.759] Initializer FindbugsMavenInitializer (done) | time=2ms
[INFO] [16:24:39.759] Base dir: /Users/dsobral/src/sonar-test
[INFO] [16:24:39.759] Working dir: /Users/dsobral/src/sonar-test/target/sonar
[INFO] [16:24:39.759] Source paths: pom.xml, src/main/scala
[INFO] [16:24:39.760] Test paths: src/test/scala
[INFO] [16:24:39.760] Binary dirs: target/classes
[INFO] [16:24:39.760] Source encoding: UTF-8, default locale: en_US
[INFO] [16:24:39.760] Index files
[INFO] [16:24:39.774] 3 files indexed
[INFO] [16:24:41.798] Quality profile for scala: Scalastyle
[INFO] [16:24:41.798] Quality profile for xml: Sonar way
[INFO] [16:24:42.141] Trying to guess scm provider from project layout...
[INFO] [16:24:42.142] Found SCM type: git
[INFO] [16:24:42.142] JIRA issues sensor will not run as some parameters are missing.
[INFO] [16:24:42.146] Sensor Lines Sensor
[INFO] [16:24:42.160] Sensor Lines Sensor (done) | time=14ms
[INFO] [16:24:42.161] Sensor QProfileSensor
[INFO] [16:24:42.164] Sensor QProfileSensor (done) | time=3ms
[INFO] [16:24:42.164] Sensor InitialOpenIssuesSensor
[INFO] [16:24:42.358] Sensor InitialOpenIssuesSensor (done) | time=194ms
[INFO] [16:24:42.358] Sensor ProjectLinksSensor
[INFO] [16:24:42.487] Sensor ProjectLinksSensor (done) | time=129ms
[INFO] [16:24:42.487] Sensor VersionEventsSensor
[INFO] [16:24:42.762] Sensor VersionEventsSensor (done) | time=275ms
[INFO] [16:24:42.762] Sensor Maven dependencies
[INFO] [16:24:50.060] Sensor Maven dependencies (done) | time=7298ms
[INFO] [16:24:50.061] Sensor com.ncredinburgh.sonar.scalastyle.ScalastyleSensor@10a89001
[INFO] [16:24:51.026] Sensor com.ncredinburgh.sonar.scalastyle.ScalastyleSensor@10a89001 (done) | time=965ms
[INFO] [16:24:51.026] Sensor XmlSensor
[INFO] [16:24:51.186] Sensor XmlSensor (done) | time=160ms
[INFO] [16:24:51.187] Sensor LineCountSensor
[INFO] [16:24:51.192] Sensor LineCountSensor (done) | time=5ms
[INFO] [16:24:51.192] Sensor ScmStatsSensor
[INFO] [16:24:51.192] Collection SCM Change log for the last 1 days
[INFO] [16:24:51.222] Executing: /bin/sh -c cd /Users/dsobral/src/sonar-test && git whatchanged '--since=2015-04-29 22:24:51 +0000' '--until=2015-05-01 22:24:51 +0000' --date=iso -- /Users/dsobral/src/sonar-test
[INFO] [16:24:51.223] Working directory: /Users/dsobral/src/sonar-test
[INFO] [16:24:51.362] Collection SCM Change log for the last 7 days
[INFO] [16:24:51.363] Executing: /bin/sh -c cd /Users/dsobral/src/sonar-test && git whatchanged '--since=2015-04-23 22:24:51 +0000' '--until=2015-05-01 22:24:51 +0000' --date=iso -- /Users/dsobral/src/sonar-test
[INFO] [16:24:51.363] Working directory: /Users/dsobral/src/sonar-test
[INFO] [16:24:51.380] Collection SCM Change log for the last 30 days
[INFO] [16:24:51.381] Executing: /bin/sh -c cd /Users/dsobral/src/sonar-test && git whatchanged '--since=2015-03-31 22:24:51 +0000' '--until=2015-05-01 22:24:51 +0000' --date=iso -- /Users/dsobral/src/sonar-test
[INFO] [16:24:51.381] Working directory: /Users/dsobral/src/sonar-test
[INFO] [16:24:51.395] Sensor ScmStatsSensor (done) | time=203ms
[INFO] [16:24:51.395] Sensor ScoverageSensor
[INFO] [16:24:51.686] [scoverage] Statement coverage for com.richrelevance.test:sonar-test is 50.00
[WARN] [16:24:51.690] File not found in file system! Users/dsobral/src/sonar-test/src/main/scala/com/rr/test/sonar/MainClass.scala
[INFO] [16:24:51.690] Sensor ScoverageSensor (done) | time=295ms
[INFO] [16:24:51.690] Sensor SCM Sensor
[INFO] [16:24:51.692] SCM provider for this project is: git
[INFO] [16:24:51.697] 1 files to be analyzed
[INFO] [16:24:51.959] 0/1 files analyzed
[WARN] [16:24:51.959] Missing blame information for the following files:
[WARN] [16:24:51.959]   * /Users/dsobral/src/sonar-test/pom.xml
[WARN] [16:24:51.959] This may lead to missing/broken features in SonarQube
[INFO] [16:24:51.959] Sensor SCM Sensor (done) | time=269ms
[INFO] [16:24:51.960] Sensor CPD Sensor
[INFO] [16:24:51.960] DefaultCpdEngine is used for scala
[INFO] [16:24:51.960] DefaultCpdEngine is used for xml
[INFO] [16:24:51.960] Sensor CPD Sensor (done) | time=0ms
[INFO] [16:24:51.961] No quality gate is configured.
[INFO] [16:24:52.311] Compare to previous analysis (2015-04-30)
[INFO] [16:24:52.362] Compare over 7 days (2015-04-23, analysis of Thu Apr 30 16:15:40 MDT 2015)
[INFO] [16:24:52.409] Compare over 21 days (2015-04-09, analysis of Thu Apr 30 16:15:40 MDT 2015)
[INFO] [16:24:52.669] Execute decorators...
[INFO] [16:24:57.196] Store results in database
[INFO] [16:24:57.869] Analysis reports generated in 35ms, dir size=1 KB
[INFO] [16:24:57.878] Analysis reports compressed in 9ms, zip size=2 KB
[INFO] [16:24:58.185] Analysis reports sent to server in 307ms
[INFO] [16:24:58.185] ANALYSIS SUCCESSFUL, you can browse XXX
[INFO] [16:24:58.185] Note that you will be able to access the updated dashboard once the server has processed the submitted analysis report.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 31.366 s
[INFO] Finished at: 2015-04-30T16:24:58-06:00
[INFO] Final Memory: 24M/324M
[INFO] ------------------------------------------------------------------------
```
