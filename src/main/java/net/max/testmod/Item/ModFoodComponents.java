package net.max.testmod.Item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ONION = new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build();
    public static final FoodComponent PORK_WITH_ONIONS = new FoodComponent.Builder().hunger(10).saturationModifier(0.8F).build();
}
