# REST-API

# API de Gestion de Campagnes de Dons

Microservice Spring Boot pour gérer des campagnes de dons et des transactions associées.

## 📋 Fonctionnalités
- **Gestion des campagnes**  
  - Création et consultation de campagnes actives.
- **Gestion des dons**  
  - Enregistrement de dons liés à une campagne.
- **Validation**  
  - Vérification des champs (montant > 0, nom non vide).
- **Documentation API**  
  - Swagger UI intégré pour tester les endpoints.

## 🛠 Technologies
- **Backend**  
  - Java 17, Spring Boot 3.4.4, Spring Data JPA
- **Base de données**  
  - H2 (en mémoire)
- **Outils**  
  - Swagger (OpenAPI 3), Maven, Lombok (optionnel)

## 🚀 Configuration

### Prérequis
- Java 17+
- Maven 3.9+

### Installation
1. Clonez le dépôt :
   ```bash
   git clone [URL_DU_DEPOT]
   ```
2. Installez les dépendances :
   ```bash
   mvn clean install
   ```

### Exécution
```bash
mvn spring-boot:run
```

## 🌐 Accès aux interfaces
- **Swagger UI** : [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)  
- **Console H2** : [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
  - JDBC URL : `jdbc:h2:mem:testdb`
  - User : `sa`
  - Password : (vide)

## 📖 Documentation API

### Endpoints
| Méthode | Endpoint                     | Description                          |
|---------|------------------------------|--------------------------------------|
| GET     | `/api/campagnes/actives`     | Liste des campagnes actives          |
| POST    | `/api/campagnes/{id}/dons`   | Enregistre un don pour une campagne  |

### Exemple de requêtes
**1. Récupérer les campagnes actives :**
```bash
curl -X GET http://localhost:8080/api/campagnes/actives
```

**2. Enregistrer un don :**
```bash
curl -X POST http://localhost:8080/api/campagnes/1/dons \
  -H "Content-Type: application/json" \
  -d '{
    "nomCampagne": "Aide aux réfugiés",
    "nomDonateur": "Ahmed Benali",
    "montant": 500
  }'
```

## 🧪 Tests
- **Tests unitaires**  
  ```bash
  mvn test
  ```
- **Tests d'intégration**  
  - Exécutez `DonControllerIntegrationTest` pour vérifier les endpoints.

## 🔧 Validation & Gestion d'Erreurs
- **Codes d'erreur**  
  - `400` : Données invalides (ex: montant ≤ 0).
  - `404` : Campagne non trouvée.
- **Exemple de réponse d'erreur** :
  ```json
  {
    "timestamp": "2024-05-20T12:00:00.000+00:00",
    "status": 400,
    "error": "Bad Request",
    "message": "montant: doit être supérieur à 0"
  }
  ```

## 📦 Structure des fichiers
```
src/
├── main/
│   ├── java/
│   │   ├── entity/       # Entités JPA (Campagne, Donation)
│   │   ├── repository/   # Repositories Spring Data JPA
│   │   ├── service/      # Logique métier
│   │   ├── controller/   # Contrôleurs REST
│   │   └── DTO/          # Objets de transfert de données
│   └── resources/
│       ├── data.sql      # Données de test
│       └── application.properties
└── test/                 # Tests unitaires et d'intégration
```

## 📄 Licence
MIT License. Voir le fichier `LICENSE` pour plus de détails.

---

**📧 Contact**  
Pour toute question : [youssef.ibourk@emsi-edu.ma](mailto:youssef.ibourk@emsi-edu.ma)
``` 
