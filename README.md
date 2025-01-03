# Santander Dev Week
Java RESTfull API criada para BootCamp Santander

## Diagrama de Classes

```mermad
classDiagram
    class User {
        +String name
        +Account account
        +List~Feature~ features
        +Card card
        +List~News~ new
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" --> "1" Account
    User "1" --> "0..*" Feature
    User "1" --> "1" Card
    User "1" --> "0..*" News
```