# aws-lambda-java-template

![](https://github.com/mishalshah92/aws-lambda-java-template/workflows/aws-lambda-java-template-ci/badge.svg)

This is java aws-lambda-java template. This template allows to build [AWS Lambda](https://aws.amazon.com/lambda/) seamlessly.

**AWS Developer Guide**: <https://docs.aws.amazon.com/lambda/latest/dg/getting-started.html>

## Developing

Below command will generate the distribution zip under `build/distributions/{app_name}.zip`.

```shell script
$ ./gradlew [Targets]
```

### **Targets**

- `$ ./gradlew clean`

    Clean the previous generated builds.

- `$ ./gradlew build`

    Compile the classes and generate build.
    Build can be found under `build/libs/{app_name}.jar` directory.

## Communication

- **Email**: mishalshah92@gmail.com
