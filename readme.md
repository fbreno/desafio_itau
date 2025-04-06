# 💼 Desafio Itaú Backend - API de Transações e Estatísticas
Este projeto é uma solução para o **desafio backend do Itaú Unibanco**, que consiste em desenvolver uma API REST capaz de receber transações financeiras e retornar estatísticas baseadas nas transações dos últimos 60 segundos.
## 🚀 Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Gradle
- Armazenamento em memória
---
## 📋 Requisitos do Desafio
A API REST deve conter os seguintes endpoints:
### 🔸 POST `/transacao`
Recebe uma nova transação no seguinte formato:
```json
{
  "valor": 123.45,
  "dataHora": "2020-08-07T12:34:56.789-03:00"
}
```
#### Regras de negócio:
- `valor` deve ser **>= 0**
- `dataHora` deve estar no **passado**
- Formato ISO 8601 aceito automaticamente via `OffsetDateTime`
#### Respostas:
- `201 Created`: Transação aceita
- `422 Unprocessable Entity`: Transação inválida
- `400 Bad Request`: JSON malformado
---
### 🔸 GET `/estatistica`
Retorna estatísticas das transações ocorridas nos **últimos 60 segundos**:
```json
{
  "count": 10,
  "sum": 1234.56,
  "avg": 123.456,
  "min": 12.34,
  "max": 123.56
}
```
- Quando não houverem transações no período, todos os valores devem ser `0`.
#### Resposta:
- `200 OK`: Estatísticas calculadas com sucesso
---
### 🔸 DELETE `/transacao`
Remove **todas** as transações armazenadas em memória.
#### Resposta:
- `200 OK`: Transações removidas com sucesso
---
## ⚙️ Regras Técnicas
- ✅ Projeto com commits sequenciais (mínimo de 3, um por endpoint)
- ✅ Armazenamento apenas **em memória**
- ✅ Sem uso de banco de dados ou cache externo
- ✅ API aceita e responde apenas com **JSON**
- ✅ Códigos organizados e bem testados
---
## 🧪 Como executar
```bash
# Clonar o repositório
git clone https://github.com/fbreno/desafio_itau.git
# Acessar o diretório do projeto
cd desafio_itau
# Executar a aplicação
./mvnw spring-boot:run
```
A API estará disponível em:  
`http://localhost:8080`

