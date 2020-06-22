# aws-lambda-deploy
Deploy AWS Lambda using Jenkins pipeline

## Installation
```
git clone https://github.com/misoboy/aws-lambda-deploy.git
```

## Overview

Jenkins provides a Lambda deployment using Pipeline.

Currently only Java demos are provided, and various languages will be updated in the future.

## Usage

Please refer to Jenkins file of Maven project for each language.

The overall process flow is as follows.

<img src="/example/process.png" alt="process" width="500"/><br/>

The following plugins must be installed to run Jenkins Pipeline.

* AWS Lambda Plugin
* CloudBees AWS Credentials Plugin
* Pipeline: AWS Steps
* Pipeline Utility Steps

Set Credentials information to access AWS resources.

<img src="/example/aws_credentials.png" alt="credentials" width="500"/><br/>

When executing Jenkins pipeline, the result will be normally executed as follows.

<img src="/example/jenkins_pipeline.png" alt="pipeline" width="500"/><br/>
