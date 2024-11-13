package com.example.priere;

public class DetailPriere {

        String title, description;
        int idImage;
        public DetailPriere (String title, String description, int idImage) {
            this.title = title;
            this.description = description;
            this.idImage=idImage;
        }


        // Getter for name
        public String getTitle() {
            return title;
        }

        // Setter for name
        public void setTitle(String name) {
            this.title = name;
        }

        // Getter for age
        public String getDescription() {
            return description;
        }

        // Setter for age
        public void setDescription(String description) {
            this.description = description;
        }

    public int getIdImage() {
        return idImage;
    }

    // Setter for age
    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }


}

