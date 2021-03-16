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
import java.util.Locale;
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
        Locale locale = new Locale("en_NG");
        ProductManager pm = new ProductManager(Locale.UK);
        Product p1 = pm.createProduct(101,"Tea",BigDecimal.valueOf(1.97), Rating.NOT_RATED,LocalDate.now().plusDays(2));
        pm.printProductReport();
        
        p1 = pm.reviewProduct(p1, "I love this tea", Rating.FIVE_STAR);
        p1 = pm.reviewProduct(p1, "This tea is superb", Rating.FOUR_STAR);
        p1 = pm.reviewProduct(p1, "Taste like shit", Rating.ONE_STAR);
        p1 = pm.reviewProduct(p1, "Fantastic tea", Rating.FIVE_STAR);
        p1 = pm.reviewProduct(p1, "Just tea", Rating.THREE_STAR);
        p1 = pm.reviewProduct(p1, "Sweet tea", Rating.FIVE_STAR);
        pm.printProductReport();
    }

}
