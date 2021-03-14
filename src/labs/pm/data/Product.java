/*
 * Copyright (C) 2021 Code_Slinger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/**
 *
 * @author Code_Slinger
 */
public abstract class Product {

    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

     Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

     Product(int id, String name, BigDecimal price) {
        this(id,name,price,Rating.NOT_RATED);
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2,RoundingMode.HALF_UP);
    }

    public Rating getRating() {
        return rating;
    }
    
    public abstract Product addRating(Rating newRating);
    
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ",  discount= "+getDiscount() + ", ratings = "+ getRating().getStar() +'}';
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj instanceof Product){
            final Product other = (Product) obj;
            return this.id == other.id && Objects.equals(this.name, other.name);
        }
        return false;
    }
 
}
