# aws-lambda-deploy

> Deploy AWS Lambda functions via **Jenkins Pipeline** — demonstrates Lambda deployment workflow with the AWS Lambda Jenkins plugin.

[![Java](https://img.shields.io/badge/Java-8+-orange?logo=java&logoColor=white)](https://java.com)
[![AWS Lambda](https://img.shields.io/badge/AWS-Lambda-FF9900?logo=amazonaws&logoColor=white)](https://aws.amazon.com/lambda/)
[![Jenkins](https://img.shields.io/badge/Jenkins-Pipeline-D33833?logo=jenkins&logoColor=white)](https://jenkins.io)

## Overview

This project provides a reference for deploying **AWS Lambda functions from a Jenkins CI/CD pipeline**, including:

- Maven build for Java Lambda functions
- Jenkins Pipeline (`Jenkinsfile`) for automated deployment
- Example Lambda functions with event handlers

## Pipeline Flow

```
GitHub Push
    └─► Jenkins Pipeline
              ├─► mvn clean package
              ├─► Create deployment package (.zip)
              └─► AWS Lambda Plugin → Update Function Code
```

## Required Jenkins Plugins

| Plugin | Purpose |
|--------|---------|
| AWS Lambda Plugin | Deploy Lambda function |
| CloudBees AWS Credentials | Manage AWS credentials |
| Pipeline: AWS Steps | AWS operations in pipeline |
| Pipeline Utility Steps | File utilities |

## Getting Started

```bash
git clone https://github.com/misoboy/aws-lambda-deploy.git
cd aws-lambda-deploy
```

### Build Lambda Package

```bash
cd aws-lambda-for-java
mvn clean package
```

### Jenkins Setup

1. Configure AWS credentials in Jenkins (`Manage Credentials`)
2. Create a Pipeline job pointing to this repository
3. The `Jenkinsfile` handles build and deploy automatically

## Project Structure

```
.
├── aws-lambda-for-java/   # Java Lambda function source
│   └── Jenkinsfile        # Jenkins pipeline definition
└── example/
    └── process.png        # Pipeline flow diagram
```

## License

MIT
