private class Main {
    
    public static void main(String[] args) {

  
        Car car1 = new Car("GMC","TERRAIN","BLACK",40,4, 4, "blutooth","2021-02-01", 2, false);
    
        System.out.println(car1.brand);
        String car1Brand = car1.brand;
        car1.ToGetBrand(car1.brand);
        
      
        car1.toGetWarranty(10);
      
    }

}