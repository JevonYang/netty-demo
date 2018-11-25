# netty-demo

## netty

## protobuf
1. 配置环境变量 protobuf/bin
2. 写proto
3. 执行protoc命令
    - -I 后面是proto文件所在的目录，
    - –java_out 后面是生成java文件存放地址
    - 最后一行是proto文件的名称，可以写绝对地址，也可以直接写proto文件名称
    - protoc -I=.\src\main\java\com\yang\netty\proto --java_out=.\src\main\java person.proto