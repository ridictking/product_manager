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
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 *
 * @author HP
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductManager pm = new ProductManager();
        Product p1 = pm.createProduct(101,"Tea",BigDecimal.valueOf(1.97), Rating.ONE_STAR,LocalDate.now().plusDays(2));
        Product p2 = pm.createProduct(102,"Coffee",BigDecimal.valueOf(1.85), Rating.FOUR_STAR);
        Product p3 = pm.createProduct(103,"Cake",BigDecimal.valueOf(3.85), Rating.TWO_STAR,LocalDate.now().plusDays(2));
        Product p4= pm.createProduct(104,"Banana",BigDecimal.valueOf(2), Rating.THREE_STAR);
       
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        p3 = p3.addRating(Rating.FIVE_STAR);
        System.out.println(p3);
    }

}