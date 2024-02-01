package jp.co.kiramex.dbSample.entity;

public class Country {
    // field
    private String name;
    private int population;

    // 引数なしコンストラクタ
    public Country() {
    }

    // 引数ありコンストラクタ
    public Country(String name, int poplation) {
        this.setName(name);
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


}
