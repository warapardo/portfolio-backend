# Etapa 1: Compilação utilizando o próprio Maven Wrapper (.mvnw)
FROM eclipse-temurin:25-jdk AS build
WORKDIR /app

# Copia os arquivos de configuração do Maven primeiro para aproveitar o cache
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN chmod +x mvnw

RUN ./mvnw dependency:go-offline

COPY src ./src
RUN ./mvnw clean package -DskipTests

# Etapa 2: Execução leve (Runtime)
FROM eclipse-temurin:25-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
