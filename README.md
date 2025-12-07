
#  CodeBleu_Infirmier - Client Infirmier

##  Description
Application client permettant aux infirmiers de déclarer des urgences médicales. Communique avec le serveur central via CORBA pour transmettre les informations d'urgence.

##  Rôle Principal
- **Déclaration d'urgences** : Formulaire de saisie des informations
- **Communication CORBA** : Envoi des données au serveur
- **Interface intuitive** : Facilité d'utilisation en contexte médical

##  Fonctionnalités
1. **Interface graphique** : Formulaire de déclaration d'urgence
2. **Champs de saisie** :
    - Catégorie d'urgence (cardiaque, respiratoire, traumatique, etc.)
   - Localisation précise
   - Identité du déclarant
4. **Validation** : Vérification des données avant envoi
5. **Feedback utilisateur** : Confirmation d'envoi réussie

##  Lancement
```bash
# 1. S'assurer que le serveur CORBA est démarré
# 2. Compiler le client
javac -cp . src/corba/*.java model/*.java ui/*.java

# 3. Démarrer l'application
java -cp . ui.InfirmierMainUI (juste reformuler pour me et ma binome n'ecrit âs le même chose)
