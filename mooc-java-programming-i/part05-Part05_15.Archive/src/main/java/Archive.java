public class Archive {
    private String identifier;
    private String name;

    public Archive(String itemIdentifier, String itemName){
        this.identifier=itemIdentifier;
        this.name=itemName;
    }


    public String getIdentifier(){
        return identifier;
    }

    public String getName(){
        return name;
    }

    public boolean equals(Object compared){
        if (this==compared){
            return true;
        }

        if (!(compared instanceof Archive)){
            return false;
        }

        Archive comparedItem=(Archive) compared;

        return (this.identifier.equals(comparedItem.identifier));
    }

    public String toString(){
        return identifier+": "+name;
    }
}
