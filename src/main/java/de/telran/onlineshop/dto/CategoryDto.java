package de.telran.onlineshop.dto;

import jakarta.validation.constraints.*;

import java.util.Objects;

public class CategoryDto {
@PositiveOrZero(message = "Invalid CategoryID")
    private long categoryID;
    @NotNull
    @NotEmpty(message = "invalid name: name is empty")
    @Size(min = 2, max = 30, message = "name mast be 2-30 char ")
    private String name;

    public CategoryDto() {
    }

    public CategoryDto(long categoryID, String name) {
        this.categoryID = categoryID;
        this.name = name;
    }

    public long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryDto categoryDto = (CategoryDto) o;
        return categoryID == categoryDto.categoryID && Objects.equals(name, categoryDto.name);
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(categoryID);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryID=" + categoryID +
                ", name='" + name + '\'' +
                '}';
    }
}
