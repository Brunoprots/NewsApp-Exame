# NewsApp-Exame

RELATÓRIO DE DESENVOLVIMENTO DA APLICAÇÃO "NEWSAPP"
Desenvolvido por: Bruno Bernardo Ungaji
Curso: Ciências da Computação
Turma: LCC3M
Nº Estudante: 20200737

1. Introdução
Este relatório descreve o desenvolvimento da aplicação NewsApp, um aplicativo Android responsável por consumir a API do jornal 'The New York Times'. O objetivo do aplicativo é fornecer aos usuários acesso a notícias atualizadas de maneira intuitiva e eficiente. O desenvolvimento foi realizado utilizando o Android Studio com Jetpack Compose para a construção da interface e a dependência Retrofit para realizar requisições HTTP.

2. Tecnologias Utilizadas
- Linguagem de Programação: Kotlin
- IDE: Android Studio
- Interface: Jetpack Compose
- Consumo de API: Retrofit
- Gerenciamento de Dependências: Gradle
- Arquitetura: MVVM (Model-View-ViewModel)
- Banco de Dados Local: Room Database
- Gerenciamento de Estados: StateFlow e LiveData
- Teste de Api: Postman
- Carregamento de imagens no Android: Coil

3. Estrutura do Projeto
A aplicação NewsApp foi organizada seguindo o padrão MVVM, garantindo uma separação clara entre a lógica de negócio, a interface do usuário e a camada de dados.
4. Implementação do Consumo da API
A API do 'The New York Times' fornece uma variedade de endpoints para acessar notícias. A implementação foi realizada usando Retrofit, que permite requisições HTTP assíncronas de forma eficiente.

5. Desenvolvimento da Interface com Jetpack Compose
O Jetpack Compose foi utilizado para criar uma interface responsiva e moderna. A tela principal exibe a lista de notícias utilizando um LazyColumn para um desempenho otimizado.

6. Conclusão
A aplicação NewsApp foi desenvolvida com sucesso utilizando as tecnologias modernas do ecossistema Android. O uso de Jetpack Compose permitiu a criação de uma interface dinâmica e intuitiva, enquanto o Retrofit garantiu um consumo eficiente da API do 'The New York Times'. A arquitetura MVVM proporcionou um código organizado e de fácil manutenção. Futuras melhorias podem incluir a implementação de um banco de dados local para armazenamento offline e a adição de filtros personalizados para os usuários.

8. Referências
Documentação oficial do Jetpack Compose: https://developer.android.com/jetpack/compose
Documentação oficial do Retrofit: https://square.github.io/retrofit/
Documentação oficial do Coil
API do "The New York Times": https://developer.nytimes.com

                                                                                INTERFACE DA APLICAÇÃO
![App-News1](https://github.com/user-attachments/assets/8c7aae66-cc6a-4b21-b10c-ac140c7657a1)
