package logic;

public class Product {
    private String idProduct;
    private String description;
    private double value;
    private int cant;
    private TypeProduct typeProduct;

    public Product(String idProduct, String description, double value, int cant, byte b, TypeProduct typeProduct) {
        this.idProduct = idProduct;
        this.description = description;
        this.value = value;
        this.cant = cant;
        this.typeProduct = typeProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getCant() {
        return cant;
    }

    private void setCant(int cant) {
        this.cant = cant;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }

    public double getIVA(){
        switch (typeProduct){
            case VIVERES : return getValue()*0.12;
            case LICORES : return getValue()*0.19;
            case MEDICAENTOS : return getValue()*0.16;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                ", cant=" + cant +
                ", typeProduct=" + typeProduct +
                '}';
    }
}

