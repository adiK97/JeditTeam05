
/*
 * jEdit - Programmer's Text Editor
 * :tabSize=8:indentSize=8:noTabs=false:
 * :folding=explicit:collapseFolds=1:
 *
 * Copyright © 2023 jEdit contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.gjt.sp.jedit;

public class BeanShellActionBuilder {
    private String name;
    private String code;
    private String isSelected;
    private boolean noRepeat;
    private boolean noRecord;
    private boolean noRememberLast;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public boolean getIsNoRepeat() {
        return noRepeat;
    }

    public boolean getIsNoRecord() {
        return noRecord;
    }

    public boolean getIsNoRememberLast() {
        return noRememberLast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }

    public void setNoRepeat(boolean noRepeat) {
        this.noRepeat = noRepeat;
    }
    public void setNoRecord(boolean noRecord) {
        this.noRecord = noRecord;
    }

    public void setNoRememberLast(boolean noRememberLast) {
        this.noRememberLast = noRememberLast;
    }
}