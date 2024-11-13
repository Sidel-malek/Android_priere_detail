# Application de Prières pour Enfants

Cette application Android introduit les enfants aux routines de prière de manière interactive en utilisant des animations, des images et du contenu multimédia.

## Objective

   Manipulation des activités
   
## Fonctionnalités

1. **Écran de Démarrage (Splash Screen)**  
2. **Écran Principal**  
   - Affiche les prières sous forme de boutons d'image.
   - **Clic court** sur une prière : affiche le nombre de raka’at (cycles) avec un message Toast.
   - **Clic long** sur une prière : ouvre une activité détaillée avec une description et une image de la prière sélectionnée.

3. **Activité Détail de la Prière**  
   - Une activité unique qui met à jour dynamiquement son contenu selon la prière sélectionnée.
   - Affiche des détails spécifiques et une image relatifs à la prière choisie.

4. **Support Audio**  
   - Utilise `MediaPlayer` d'Android pour lire les fichiers audio, permettant aux utilisateurs d'écouter du contenu multimédia lié à la prière.

## Comment Utiliser

1. **Lancer l'application** : Affichez l'écran d'accueil animé et attendez qu'il passe au menu principal.
2. **Explorer les prières** : Cliquez sur une icône de prière pour voir le nombre de raka’at ou faites un clic long pour voir plus de détails.
3. **Écouter l'audio** : Profitez du contenu multimédia pour enrichir l'expérience d'apprentissage.

## Configuration

1. Clonez ce dépôt.
2. Ouvrez-le dans Android Studio.
3. Compilez et lancez l'application sur un appareil ou un émulateur Android.

## Technologies Utilisées

- **Android SDK** : Composants de base d'Android.
- **MediaPlayer** : Pour lire les fichiers audio dans l'application.