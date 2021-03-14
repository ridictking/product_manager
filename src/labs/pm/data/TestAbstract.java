/*
 * Copyright (C) 2021 HP
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

/**
 *
 * @author HP
 */
public abstract class TestAbstract implements TestInterface{

    @Override
    public void g() {
        TestInterface.super.g(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void f() {
        TestInterface.super.f(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void e() {
        TestInterface.super.e(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public abstract void a();
    
}
