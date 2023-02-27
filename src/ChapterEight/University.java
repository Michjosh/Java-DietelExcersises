package ChapterEight;

    public enum University {
        UNILAG("University of Lagos", "Lagos"),
        UNIPORT("University of PortHarcourt","Rivers"),
        LASU("Lagos state university", "Lagos");

        private String name;
        private String state;

        University(String name, String state){
            this.name= name;
            this.state = state;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

