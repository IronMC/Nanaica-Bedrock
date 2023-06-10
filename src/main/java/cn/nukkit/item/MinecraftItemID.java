/*
 * https://PowerNukkit.org - The Nukkit you know but Powerful!
 * Copyright (C) 2020  José Roberto de Araújo Júnior
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

package cn.nukkit.item;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.PowerNukkitXOnly;
import cn.nukkit.api.Since;
import io.netty.util.internal.EmptyArrays;

import javax.annotation.Nullable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * An enum containing all valid vanilla Minecraft items.
 * 添加原版新物品时一定不要忘记在这里补上命名空间的枚举(例如 minecraft:quartz_bricks 这里填写QUARTZ_BRICKS)
 *
 * @author joserobjr
 * @since 2023-06-09 v1.20.0-r1 现在已经弃用，不需要再添加物品名称
 * @since 2020-12-20
 */
@Deprecated
@PowerNukkitOnly
@Since("1.4.0.0-PN")
public enum MinecraftItemID {
    @PowerNukkitOnly @Since("1.4.0.0-PN") UNKNOWN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") QUARTZ_BRICKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRACKED_NETHER_BRICKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHISELED_NETHER_BRICKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_WARPED_HYPHAE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_CRIMSON_HYPHAE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_HYPHAE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_HYPHAE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_WALL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_DOUBLE_SLAB(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_SLAB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SOUL_CAMPFIRE_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRYING_OBSIDIAN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_GOLD_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TWISTING_VINES,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHAIN_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_BRICK_SLAB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLACKSTONE_DOUBLE_SLAB(true, true),
    @PowerNukkitOnly @Since("1.6.0.0-PNX") STONE_BLOCK_SLAB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GILDED_BLACKSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRACKED_POLISHED_BLACKSTONE_BRICKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHISELED_POLISHED_BLACKSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_BRICK_WALL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLACKSTONE_WALL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLACKSTONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_BRICK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BLACKSTONE_BRICKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLACKSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RESPAWN_ANCHOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ANCIENT_DEBRIS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SOUL_LANTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SOUL_TORCH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_DOUBLE_SLAB(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_DOUBLE_SLAB(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_SLAB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_SLAB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_FENCE_GATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_FENCE_GATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_FENCE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_FENCE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_WALL_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_WALL_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_STANDING_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_STANDING_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_PLANKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_PLANKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_WARPED_STEM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_CRIMSON_STEM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TARGET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_SPROUTS_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SOUL_FIRE(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SOUL_SOIL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_BASALT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BASALT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_NYLIUM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_NYLIUM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WEEPING_VINES,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SHROOMLIGHT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_FUNGUS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_FUNGUS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_WART_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_STEM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_STEM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_ROOTS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_ROOTS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LODESTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HONEYCOMB_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HONEY_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEEHIVE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEE_NEST,
    //@PowerNukkitOnly @Since("1.4.0.0-PN") STICKYPISTONARMCOLLISION("minecraft:stickyPistonArmCollision", "minecraft:sticky_piston"),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WITHER_ROSE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIGHT_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIT_BLAST_FURNACE(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") COMPOSTER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOOD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JIGSAW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LAVA_CAULDRON(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAMPFIRE_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") LANTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SWEET_BERRY_BUSH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BELL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LOOM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BARREL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SMITHING_TABLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FLETCHING_TABLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CARTOGRAPHY_TABLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIT_SMOKER(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SMOKER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONECUTTER_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLAST_FURNACE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GRINDSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LECTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARKOAK_WALL_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARKOAK_STANDING_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_WALL_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_STANDING_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_WALL_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_STANDING_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_WALL_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_STANDING_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SMOOTH_QUARTZ_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_NETHER_BRICK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SMOOTH_STONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_WALL_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_STANDING_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") NORMAL_STONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MOSSY_COBBLESTONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") END_BRICK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SMOOTH_SANDSTONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SMOOTH_RED_SANDSTONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MOSSY_STONE_BRICK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_ANDESITE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_DIORITE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLISHED_GRANITE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ANDESITE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIORITE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GRANITE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REAL_DOUBLE_STONE_SLAB4(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") REAL_DOUBLE_STONE_SLAB3(true, true),
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") STONE_BLOCK_SLAB3,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DOUBLE_STONE_SLAB4,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") STONE_BLOCK_SLAB4,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SCAFFOLDING,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BAMBOO_SAPLING(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BAMBOO,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DOUBLE_STONE_SLAB3,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BARRIER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BUBBLE_COLUMN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TURTLE_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") AIR(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CONDUIT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SEA_PICKLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CARVED_PUMPKIN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DRIED_KELP_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") KELP_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CORAL_FAN_HANG3,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CORAL_FAN_HANG2,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CORAL_FAN_HANG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CORAL_FAN_DEAD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CORAL_FAN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CORAL_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CORAL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SEAGRASS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_118(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_117(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_116(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_115(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_114(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_113(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_112(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_111(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_110(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_109(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_108(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_107(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_106(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_105(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_104(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_103(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_102(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_101(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_100(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_99(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_98(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_97(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_96(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_95(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_94(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_93(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_92(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_91(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_90(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_89(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_88(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_87(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_86(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_85(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_84(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_83(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_82(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_81(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_80(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_79(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_78(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_77(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_76(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_75(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_74(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_73(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_72(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_71(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_70(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_69(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_68(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_67(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_66(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_65(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_64(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_63(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_62(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_61(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_60(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_59(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_58(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_57(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_56(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_55(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_54(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_53(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_52(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_51(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_50(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_49(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_48(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_47(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_46(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_45(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_44(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_43(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_42(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_41(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_40(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_39(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_38(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_37(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_36(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_35(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_34(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_33(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_32(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_31(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_30(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_29(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_28(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_27(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_26(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_25(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_24(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_23(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_22(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_21(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_20(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_19(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_18(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_17(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_16(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_15(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_14(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_13(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_12(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_11(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_10(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_9(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_8(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_7(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_6(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_5(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_4(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_3(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_2(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_1(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLUE_ICE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_OAK_LOG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_DARK_OAK_LOG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_ACACIA_LOG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_JUNGLE_LOG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_BIRCH_LOG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIPPED_SPRUCE_LOG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PRISMARINE_BRICKS_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_PRISMARINE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PRISMARINE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GRASS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIRT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COBBLESTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PLANKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SAPLING,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEDROCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FLOWING_WATER(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WATER(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") FLOWING_LAVA(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") LAVA(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SAND,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GRAVEL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLD_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COAL_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LOG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEAVES,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPONGE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GLASS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LAPIS_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LAPIS_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DISPENSER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SANDSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NOTEBLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BED_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_RAIL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DETECTOR_RAIL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STICKY_PISTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WEB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TALLGRASS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DEADBUSH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PISTON,
    //@PowerNukkitOnly @Since("1.4.0.0-PN") PISTONARMCOLLISION("minecraft:pistonArmCollision", "minecraft:piston"),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOOL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WHITE_WOOL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELEMENT_0(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") YELLOW_FLOWER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_FLOWER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BROWN_MUSHROOM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_MUSHROOM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLD_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REAL_DOUBLE_STONE_SLAB(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") DOUBLE_STONE_SLAB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BRICK_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TNT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BOOKSHELF,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MOSSY_COBBLESTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") OBSIDIAN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TORCH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FIRE(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") MOB_SPAWNER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") OAK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHEST,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REDSTONE_WIRE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRAFTING_TABLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WHEAT_BLOCK("minecraft:item.wheat", "minecraft:wheat"),
    @PowerNukkitOnly @Since("1.4.0.0-PN") FARMLAND,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FURNACE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIT_FURNACE(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") STANDING_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") LADDER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RAIL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WALL_SIGN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEVER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REDSTONE_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIT_REDSTONE_ORE(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") UNLIT_REDSTONE_TORCH(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") REDSTONE_TORCH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SNOW_LAYER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ICE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SNOW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CACTUS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CLAY,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REEDS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUKEBOX,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FENCE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PUMPKIN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERRACK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SOUL_SAND,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GLOWSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PORTAL(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIT_PUMPKIN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAKE_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") UNPOWERED_REPEATER(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") POWERED_REPEATER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") INVISIBLEBEDROCK(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MONSTER_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONEBRICK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BROWN_MUSHROOM_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_MUSHROOM_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_BARS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GLASS_PANE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MELON_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PUMPKIN_STEM(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") MELON_STEM(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") VINE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FENCE_GATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BRICK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_BRICK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MYCELIUM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WATERLILY,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_BRICK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_BRICK_FENCE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_BRICK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_WART_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ENCHANTING_TABLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BREWINGSTANDBLOCK(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAULDRON_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") END_PORTAL(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") END_PORTAL_FRAME,
    @PowerNukkitOnly @Since("1.4.0.0-PN") END_STONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DRAGON_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REDSTONE_LAMP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIT_REDSTONE_LAMP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DROPPER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACTIVATOR_RAIL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COCOA(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SANDSTONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") EMERALD_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ENDER_CHEST,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TRIPWIRE_HOOK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TRIPWIRE(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") EMERALD_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COMMAND_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEACON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COBBLESTONE_WALL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FLOWER_POT_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CARROTS(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") POTATOES(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_BUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SKULL_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ANVIL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TRAPPED_CHEST,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIGHT_WEIGHTED_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HEAVY_WEIGHTED_PRESSURE_PLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") UNPOWERED_COMPARATOR(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") POWERED_COMPARATOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DAYLIGHT_DETECTOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REDSTONE_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") QUARTZ_ORE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HOPPER_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") QUARTZ_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") QUARTZ_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DOUBLE_WOODEN_SLAB(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_SLAB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STAINED_HARDENED_CLAY,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STAINED_GLASS_PANE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEAVES2,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LOG2,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SLIME,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GLOW_STICK(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_TRAPDOOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PRISMARINE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SEALANTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HAY_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CARPET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HARDENED_CLAY,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COAL_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PACKED_ICE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DOUBLE_PLANT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STANDING_BANNER(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WALL_BANNER(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") DAYLIGHT_DETECTOR_INVERTED(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_SANDSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_SANDSTONE_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REAL_DOUBLE_STONE_SLAB2(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") DOUBLE_STONE_SLAB2,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") STONE_BLOCK_SLAB2,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_FENCE_GATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_FENCE_GATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_FENCE_GATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_FENCE_GATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_FENCE_GATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") REPEATING_COMMAND_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHAIN_COMMAND_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HARD_GLASS_PANE(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") HARD_STAINED_GLASS_PANE(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHEMICAL_HEAT(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_DOOR_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") GRASS_PATH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FRAME_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHORUS_FLOWER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PURPUR_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COLORED_TORCH_RG(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") PURPUR_STAIRS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COLORED_TORCH_BP(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") UNDYED_SHULKER_BOX,
    @PowerNukkitOnly @Since("1.4.0.0-PN") END_BRICKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FROSTED_ICE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") END_ROD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") END_GATEWAY(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ALLOW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DENY,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BORDER_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MAGMA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_WART_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_NETHER_BRICK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BONE_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRUCTURE_VOID,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SHULKER_BOX,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PURPLE_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WHITE_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ORANGE_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MAGENTA_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIGHT_BLUE_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") YELLOW_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIME_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PINK_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GRAY_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SILVER_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CYAN_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLUE_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BROWN_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GREEN_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLACK_GLAZED_TERRACOTTA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CONCRETE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CONCRETE_POWDER("minecraft:concretepowder", "minecraft:concrete_powder", new String[]{"minecraft:concrete_powder"}),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHEMISTRY_TABLE(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") UNDERWATER_TORCH(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHORUS_PLANT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STAINED_GLASS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAMERA_BLOCK_FORM(true, true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") PODZOL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEETROOT_BLOCK_FORM(true, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONECUTTER(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") GLOWINGOBSIDIAN(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERREACTOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") INFO_UPDATE(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") INFO_UPDATE2(false, true),
    //@PowerNukkitOnly @Since("1.4.0.0-PN") MOVINGBLOCK("minecraft:movingBlock", "minecraft:air"),
    @PowerNukkitOnly @Since("1.4.0.0-PN") OBSERVER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRUCTURE_BLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HARD_GLASS(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") HARD_STAINED_GLASS(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") RESERVED6(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_SHOVEL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_PICKAXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_AXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FLINT_AND_STEEL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") APPLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BOW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ARROW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COAL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_INGOT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLD_INGOT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_SWORD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_SWORD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_SHOVEL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_PICKAXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_AXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_SWORD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_SHOVEL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_PICKAXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_AXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_SWORD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_SHOVEL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_PICKAXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_AXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STICK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BOWL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSHROOM_STEW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_SWORD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_SHOVEL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_PICKAXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_AXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRING,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FEATHER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GUNPOWDER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_HOE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STONE_HOE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_HOE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_HOE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_HOE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WHEAT_SEEDS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WHEAT(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BREAD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEATHER_HELMET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEATHER_CHESTPLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEATHER_LEGGINGS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEATHER_BOOTS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHAINMAIL_HELMET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHAINMAIL_CHESTPLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHAINMAIL_LEGGINGS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHAINMAIL_BOOTS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_HELMET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_CHESTPLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_LEGGINGS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_BOOTS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_HELMET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_CHESTPLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_LEGGINGS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_BOOTS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_HELMET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_CHESTPLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_LEGGINGS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_BOOTS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FLINT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PORKCHOP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COOKED_PORKCHOP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PAINTING,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_APPLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") OAK_SIGN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOODEN_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BUCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MINECART,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SADDLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") REDSTONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SNOWBALL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BOAT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEATHER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") KELP(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BRICK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CLAY_BALL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SUGAR_CANE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PAPER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BOOK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SLIME_BALL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHEST_MINECART,
    @PowerNukkitOnly @Since("1.4.0.0-PN") EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COMPASS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FISHING_ROD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CLOCK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GLOWSTONE_DUST,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COOKED_COD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BONE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SUGAR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAKE(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BED(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") REPEATER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COOKIE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FILLED_MAP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SHEARS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MELON_SLICE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PUMPKIN_SEEDS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MELON_SEEDS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEEF,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COOKED_BEEF,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHICKEN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COOKED_CHICKEN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ROTTEN_FLESH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ENDER_PEARL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLAZE_ROD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GHAST_TEAR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLD_NUGGET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_WART(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") POTION,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GLASS_BOTTLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPIDER_EYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FERMENTED_SPIDER_EYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLAZE_POWDER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MAGMA_CREAM,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BREWING_STAND,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAULDRON(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ENDER_EYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GLISTERING_MELON_SLICE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") EXPERIENCE_BOTTLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FIRE_CHARGE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WRITABLE_BOOK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WRITTEN_BOOK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") EMERALD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FRAME(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") FLOWER_POT(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CARROT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POTATO,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BAKED_POTATO,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POISONOUS_POTATO,
    @PowerNukkitOnly @Since("1.4.0.0-PN") EMPTY_MAP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_CARROT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SKULL(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CARROT_ON_A_STICK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_STAR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PUMPKIN_PIE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FIREWORK_ROCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FIREWORK_STAR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ENCHANTED_BOOK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COMPARATOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERBRICK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") QUARTZ,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TNT_MINECART,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HOPPER_MINECART,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PRISMARINE_SHARD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HOPPER(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") RABBIT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COOKED_RABBIT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RABBIT_STEW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RABBIT_FOOT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RABBIT_HIDE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEATHER_HORSE_ARMOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_HORSE_ARMOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GOLDEN_HORSE_ARMOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DIAMOND_HORSE_ARMOR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LEAD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NAME_TAG("minecraft:name_tag", "minecraft:name_tag", new String[]{"minecraft:nametag"}),
    @PowerNukkitOnly @Since("1.4.0.0-PN") PRISMARINE_CRYSTALS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COOKED_MUTTON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ARMOR_STAND,
    @PowerNukkitOnly @Since("1.4.0.0-PN") END_CRYSTAL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHORUS_FRUIT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POPPED_CHORUS_FRUIT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BANNER_PATTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DRAGON_BREATH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPLASH_POTION,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LINGERING_POTION,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPARKLER(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") COMMAND_BLOCK_MINECART,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELYTRA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SHULKER_SHELL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BANNER,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MEDICINE(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BALLOON(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") RAPID_FERTILIZER(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") TOTEM_OF_UNDYING,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLEACH(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") IRON_NUGGET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ICE_BOMB(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") TRIDENT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEETROOT(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEETROOT_SEEDS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEETROOT_SOUP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SALMON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TROPICAL_FISH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PUFFERFISH,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COOKED_SALMON,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DRIED_KELP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NAUTILUS_SHELL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ENCHANTED_GOLDEN_APPLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HEART_OF_THE_SEA,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SCUTE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TURTLE_HELMET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PHANTOM_MEMBRANE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CROSSBOW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_SIGN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_SIGN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_SIGN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_SIGN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_SIGN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SWEET_BERRIES,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAMERA(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") COMPOUND(false, false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_13,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_CAT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_BLOCKS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_CHIRP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_FAR,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_MALL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_MELLOHI,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_STAL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_STRAD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_WARD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_11,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_WAIT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MUSIC_DISC_PIGSTEP,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") MUSIC_DISC_OTHERSIDE,
    @PowerNukkitXOnly @Since("1.19.40-r2") MUSIC_DISC_5,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SHIELD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAMPFIRE(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SUSPICIOUS_STEW,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HONEYCOMB,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HONEY_BOTTLE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LODESTONE_COMPASS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_INGOT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_SWORD,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_SHOVEL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_PICKAXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_AXE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_HOE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_HELMET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_CHESTPLATE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_LEGGINGS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_BOOTS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHERITE_SCRAP,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_SIGN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_SIGN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CRIMSON_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_DOOR(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") WARPED_FUNGUS_ON_A_STICK,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHAIN(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") NETHER_SPROUTS(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") SOUL_CAMPFIRE(false),
    @PowerNukkitOnly @Since("1.4.0.0-PN") COD_BUCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GHAST_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FLOWER_BANNER_PATTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ZOGLIN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLUE_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SKULL_BANNER_PATTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ENDERMITE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") POLAR_BEAR_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WHITE_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TROPICAL_FISH_BUCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CYAN_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIGHT_BLUE_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIME_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ZOMBIE_VILLAGER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRAY_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GREEN_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") EVOKER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WITHER_SKELETON_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SALMON_BUCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") JUNGLE_BOAT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLACK_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MAGMA_CUBE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TROPICAL_FISH_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") VEX_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FIELD_MASONED_BANNER_PATTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WANDERING_TRADER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BROWN_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PANDA_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SILVERFISH_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") OCELOT_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LAVA_BUCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SKELETON_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") VILLAGER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ELDER_GUARDIAN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ACACIA_BOAT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") OAK_BOAT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PHANTOM_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HOGLIN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DARK_OAK_BOAT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HUSK_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BLAZE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BORDURE_INDENTED_BANNER_PATTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MULE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CREEPER_BANNER_PATTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ZOMBIE_HORSE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BEE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COD_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LLAMA_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") FOX_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PIGLIN_BRUTE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PIG_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COW_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") NPC_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SQUID_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MAGENTA_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RED_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WITCH_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") INK_SAC,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ORANGE_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PILLAGER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAVE_SPIDER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BONE_MEAL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PUFFERFISH_BUCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BAT_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPRUCE_BOAT,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SPIDER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PIGLIN_BANNER_PATTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RABBIT_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MOJANG_BANNER_PATTERN,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PIGLIN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") TURTLE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MOOSHROOM_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PUFFERFISH_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PARROT_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ZOMBIE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WOLF_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GRAY_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") COCOA_BEANS,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SKELETON_HORSE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SHEEP_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SLIME_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") VINDICATOR_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DROWNED_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") MILK_BUCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DOLPHIN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") DONKEY_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PURPLE_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") BIRCH_BOAT,
    //@PowerNukkitOnly @Since("1.4.0.0-PN") DEBUG_STICK(false, true),
    @PowerNukkitOnly @Since("1.4.0.0-PN") ENDERMAN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHICKEN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SHULKER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") STRIDER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") ZOMBIE_PIGMAN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") YELLOW_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CAT_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") GUARDIAN_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") PINK_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") SALMON_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CREEPER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") HORSE_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LAPIS_LAZULI,
    @PowerNukkitOnly @Since("1.4.0.0-PN") RAVAGER_SPAWN_EGG,
    @PowerNukkitOnly @Since("1.4.0.0-PN") WATER_BUCKET,
    @PowerNukkitOnly @Since("1.4.0.0-PN") LIGHT_GRAY_DYE,
    @PowerNukkitOnly @Since("1.4.0.0-PN") CHARCOAL,
    @PowerNukkitOnly @Since("1.4.0.0-PN") AGENT_SPAWN_EGG(false, false, true),
    @PowerNukkitOnly INFESTED_DEEPSLATE,
    @PowerNukkitOnly RAW_GOLD_BLOCK,
    @PowerNukkitOnly RAW_COPPER_BLOCK,
    @PowerNukkitOnly RAW_IRON_BLOCK,
    @PowerNukkitOnly WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB,
    @PowerNukkitOnly WAXED_OXIDIZED_CUT_COPPER_SLAB,
    @PowerNukkitOnly WAXED_OXIDIZED_CUT_COPPER_STAIRS,
    @PowerNukkitOnly WAXED_OXIDIZED_CUT_COPPER,
    @PowerNukkitOnly WAXED_OXIDIZED_COPPER,
    @PowerNukkitOnly GLOW_LICHEN,
    @PowerNukkitOnly CRACKED_DEEPSLATE_BRICKS,
    @PowerNukkitOnly CRACKED_DEEPSLATE_TILES,
    @PowerNukkitOnly DEEPSLATE_COPPER_ORE,
    @PowerNukkitOnly DEEPSLATE_EMERALD_ORE,
    @PowerNukkitOnly DEEPSLATE_COAL_ORE,
    @PowerNukkitOnly DEEPSLATE_DIAMOND_ORE,
    @PowerNukkitOnly LIT_DEEPSLATE_REDSTONE_ORE(false, true),
    @PowerNukkitOnly DEEPSLATE_REDSTONE_ORE,
    @PowerNukkitOnly DEEPSLATE_GOLD_ORE,
    @PowerNukkitOnly DEEPSLATE_IRON_ORE,
    @PowerNukkitOnly DEEPSLATE_LAPIS_ORE,
    @PowerNukkitOnly DEEPSLATE_BRICK_DOUBLE_SLAB(false, true),
    @PowerNukkitOnly DEEPSLATE_TILE_DOUBLE_SLAB(false, true),
    @PowerNukkitOnly POLISHED_DEEPSLATE_DOUBLE_SLAB(false, true),
    @PowerNukkitOnly COBBLED_DEEPSLATE_DOUBLE_SLAB(false, true),
    @PowerNukkitOnly CHISELED_DEEPSLATE,
    @PowerNukkitOnly DEEPSLATE_BRICK_WALL,
    @PowerNukkitOnly DEEPSLATE_BRICK_STAIRS,
    @PowerNukkitOnly DEEPSLATE_BRICK_SLAB,
    @PowerNukkitOnly DEEPSLATE_BRICKS,
    @PowerNukkitOnly DEEPSLATE_TILE_WALL,
    @PowerNukkitOnly DEEPSLATE_TILE_STAIRS,
    @PowerNukkitOnly DEEPSLATE_TILE_SLAB,
    @PowerNukkitOnly DEEPSLATE_TILES,
    @PowerNukkitOnly POLISHED_DEEPSLATE_WALL,
    @PowerNukkitOnly POLISHED_DEEPSLATE_STAIRS,
    @PowerNukkitOnly POLISHED_DEEPSLATE_SLAB,
    @PowerNukkitOnly POLISHED_DEEPSLATE,
    @PowerNukkitOnly COBBLED_DEEPSLATE_WALL,
    @PowerNukkitOnly COBBLED_DEEPSLATE_STAIRS,
    @PowerNukkitOnly COBBLED_DEEPSLATE_SLAB,
    @PowerNukkitOnly COBBLED_DEEPSLATE,
    @PowerNukkitOnly DEEPSLATE,
    @PowerNukkitOnly SMOOTH_BASALT,
    @PowerNukkitOnly CAVE_VINES_HEAD_WITH_BERRIES(false, true),
    @PowerNukkitOnly CAVE_VINES_BODY_WITH_BERRIES(false, true),
    @PowerNukkitOnly WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB,
    @PowerNukkitOnly WAXED_EXPOSED_DOUBLE_CUT_COPPER_SLAB,
    @PowerNukkitOnly WAXED_DOUBLE_CUT_COPPER_SLAB,
    @PowerNukkitOnly OXIDIZED_DOUBLE_CUT_COPPER_SLAB,
    @PowerNukkitOnly WEATHERED_DOUBLE_CUT_COPPER_SLAB,
    @PowerNukkitOnly EXPOSED_DOUBLE_CUT_COPPER_SLAB,
    @PowerNukkitOnly DOUBLE_CUT_COPPER_SLAB,
    @PowerNukkitOnly WAXED_WEATHERED_CUT_COPPER_SLAB,
    @PowerNukkitOnly WAXED_EXPOSED_CUT_COPPER_SLAB,
    @PowerNukkitOnly WAXED_CUT_COPPER_SLAB,
    @PowerNukkitOnly OXIDIZED_CUT_COPPER_SLAB,
    @PowerNukkitOnly WEATHERED_CUT_COPPER_SLAB,
    @PowerNukkitOnly EXPOSED_CUT_COPPER_SLAB,
    @PowerNukkitOnly CUT_COPPER_SLAB,
    @PowerNukkitOnly WAXED_WEATHERED_CUT_COPPER_STAIRS,
    @PowerNukkitOnly WAXED_EXPOSED_CUT_COPPER_STAIRS,
    @PowerNukkitOnly WAXED_CUT_COPPER_STAIRS,
    @PowerNukkitOnly OXIDIZED_CUT_COPPER_STAIRS,
    @PowerNukkitOnly WEATHERED_CUT_COPPER_STAIRS,
    @PowerNukkitOnly EXPOSED_CUT_COPPER_STAIRS,
    @PowerNukkitOnly CUT_COPPER_STAIRS,
    @PowerNukkitOnly WAXED_WEATHERED_CUT_COPPER,
    @PowerNukkitOnly WAXED_EXPOSED_CUT_COPPER,
    @PowerNukkitOnly WAXED_CUT_COPPER,
    @PowerNukkitOnly OXIDIZED_CUT_COPPER,
    @PowerNukkitOnly WEATHERED_CUT_COPPER,
    @PowerNukkitOnly EXPOSED_CUT_COPPER,
    @PowerNukkitOnly CUT_COPPER,
    @PowerNukkitOnly WAXED_WEATHERED_COPPER,
    @PowerNukkitOnly WAXED_EXPOSED_COPPER,
    @PowerNukkitOnly WAXED_COPPER,
    @PowerNukkitOnly OXIDIZED_COPPER,
    @PowerNukkitOnly WEATHERED_COPPER,
    @PowerNukkitOnly EXPOSED_COPPER,
    @PowerNukkitOnly COPPER_BLOCK,
    @PowerNukkitOnly GLOW_FRAME_BLOCK_FORM(true, true),
    @PowerNukkitOnly FLOWERING_AZALEA,
    @PowerNukkitOnly AZALEA,
    @PowerNukkitOnly SMALL_DRIPLEAF_BLOCK,
    @PowerNukkitOnly MOSS_CARPET,
    @PowerNukkitOnly TINTED_GLASS,
    @PowerNukkitOnly TUFF,
    @PowerNukkitOnly SMALL_AMETHYST_BUD,
    @PowerNukkitOnly MEDIUM_AMETHYST_BUD,
    @PowerNukkitOnly LARGE_AMETHYST_BUD,
    @PowerNukkitOnly AMETHYST_CLUSTER,
    @PowerNukkitOnly BUDDING_AMETHYST,
    @PowerNukkitOnly AMETHYST_BLOCK,
    @PowerNukkitOnly CALCITE,
    @PowerNukkitOnly AZALEA_LEAVES_FLOWERED,
    @PowerNukkitOnly AZALEA_LEAVES,
    @PowerNukkitOnly BIG_DRIPLEAF,
    @PowerNukkitOnly CAVE_VINES(false, true),
    @PowerNukkitOnly SPORE_BLOSSOM,
    @PowerNukkitOnly MOSS_BLOCK,
    @PowerNukkitOnly HANGING_ROOTS,
    @PowerNukkitOnly DIRT_WITH_ROOTS,
    @PowerNukkitOnly DRIPSTONE_BLOCK,
    @PowerNukkitOnly LIGHTNING_ROD,
    @PowerNukkitOnly COPPER_ORE,
    @PowerNukkitOnly POINTED_DRIPSTONE,
    @PowerNukkitOnly SCULK_SENSOR(false, true),
    @PowerNukkitOnly POWDER_SNOW(false, true),
    @PowerNukkitOnly POWDER_SNOW_BUCKET,
    @PowerNukkitOnly AXOLOTL_BUCKET,
    @PowerNukkitOnly @Since("1.19.50-r1") TADPOLE_BUCKET,
    @PowerNukkitOnly AXOLOTL_SPAWN_EGG,
    @PowerNukkitOnly GOAT_SPAWN_EGG,
    @PowerNukkitOnly GLOW_SQUID_SPAWN_EGG,
    @PowerNukkitXOnly @Since("1.19.30-r2") WARDEN_SPAWN_EGG,
    @PowerNukkitXOnly @Since("1.19.30-r2") ALLAY_SPAWN_EGG,
    @PowerNukkitXOnly @Since("1.19.30-r2") FROG_SPAWN_EGG,
    @PowerNukkitXOnly @Since("1.19.30-r2") TADPOLE_SPAWN_EGG,
    @PowerNukkitOnly GLOW_INK_SAC,
    @PowerNukkitOnly COPPER_INGOT,
    @PowerNukkitOnly RAW_IRON,
    @PowerNukkitOnly RAW_GOLD,
    @PowerNukkitOnly RAW_COPPER,
    @PowerNukkitOnly GLOW_FRAME(false),
    @PowerNukkitXOnly @Since("1.19.80-r3") GOAT_HORN,
    @PowerNukkitOnly AMETHYST_SHARD,
    @PowerNukkitOnly SPYGLASS,
    @PowerNukkitOnly GLOW_BERRIES,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_STAIRS,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_TRAPDOOR,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_ROOTS,
    @PowerNukkitXOnly @Since("1.19.20-r4") MUDDY_MANGROVE_ROOTS,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_SLAB,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_BUTTON,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_LOG,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_FENCE,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_FENCE_GATE,
    @PowerNukkitXOnly @Since("1.19.20-r4") STRIPPED_MANGROVE_LOG,
    @PowerNukkitXOnly @Since("1.19.20-r4") STRIPPED_MANGROVE_WOOD,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_PLANKS,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_WOOD,
    @PowerNukkitXOnly @Since("1.19.20-r4") MANGROVE_PRESSURE_PLATE,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") MANGROVE_BOAT,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") MANGROVE_DOOR,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") MANGROVE_SIGN,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") OAK_CHEST_BOAT,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") BIRCH_CHEST_BOAT,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") JUNGLE_CHEST_BOAT,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") SPRUCE_CHEST_BOAT,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") ACACIA_CHEST_BOAT,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") DARK_OAK_CHEST_BOAT,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") MANGROVE_CHEST_BOAT,
    @PowerNukkitXOnly @Since("1.6.0.0-PNX") CHEST_BOAT,
    @PowerNukkitXOnly @Since("1.19.50-r1") DISC_FRAGMENT_5,
    @PowerNukkitXOnly @Since("1.19.50-r1") ECHO_SHARD,
    @PowerNukkitXOnly @Since("1.19.60-r1") SCULK,
    @PowerNukkitXOnly @Since("1.19.60-r1") SCULK_VEIN,
    @PowerNukkitXOnly @Since("1.19.60-r1") SCULK_CATALYST,
    @PowerNukkitXOnly @Since("1.19.60-r1") SCULK_SHRIEKER,
    @PowerNukkitXOnly @Since("1.19.60-r1") REINFORCED_DEEPSLATE,
    @PowerNukkitXOnly @Since("1.19.60-r1") FROG_SPAWN,
    @PowerNukkitXOnly @Since("1.19.60-r1") PEARLESCENT_FROGLIGHT,
    @PowerNukkitXOnly @Since("1.19.60-r1") VERDANT_FROGLIGHT,
    @PowerNukkitXOnly @Since("1.19.60-r1") OCHRE_FROGLIGHT,
    @PowerNukkitXOnly @Since("1.19.60-r1") MUD,
    @PowerNukkitXOnly @Since("1.19.60-r1") MANGROVE_PROPAGULE,
    @PowerNukkitXOnly @Since("1.19.60-r1") MUD_BRICKS,
    @PowerNukkitXOnly @Since("1.19.60-r1") MANGROVE_PROPAGULE_HANGING,
    @PowerNukkitXOnly @Since("1.19.60-r1") PACKED_MUD,
    @PowerNukkitXOnly @Since("1.19.60-r1") MUD_BRICK_SLAB,
    @PowerNukkitXOnly @Since("1.19.60-r1") MUD_BRICK_DOUBLE_SLAB,
    @PowerNukkitXOnly @Since("1.19.60-r1") MUD_BRICK_STAIRS,
    @PowerNukkitXOnly @Since("1.19.60-r1") MUD_BRICK_WALL,
    @PowerNukkitXOnly @Since("1.19.60-r1") MANGROVE_STANDING_SIGN,
    @PowerNukkitXOnly @Since("1.19.60-r1") MANGROVE_WALL_SIGN,
    @PowerNukkitXOnly @Since("1.19.63-r2") MANGROVE_LEAVES,
    @PowerNukkitXOnly @Since("1.19.63-r2") SEA_LANTERN,
    @PowerNukkitXOnly @Since("1.19.63-r2") RECOVERY_COMPASS,
    @PowerNukkitXOnly @Since("1.19.63-r2") GLOBE_BANNER_PATTERN,
    @PowerNukkitXOnly @Since("1.19.63-r2") CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") WHITE_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") ORANGE_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") MAGENTA_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") LIGHT_BLUE_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") YELLOW_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") LIME_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") PINK_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") GRAY_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") LIGHT_GRAY_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") CYAN_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") PURPLE_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") BLUE_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") BROWN_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") GREEN_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") RED_CANDLE,
    @PowerNukkitXOnly @Since("1.19.63-r2") BLACK_CANDLE,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    LIGHT_GRAY_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    GRAY_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    BLACK_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    BROWN_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    RED_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    ORANGE_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    YELLOW_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    LIME_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    GREEN_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    CYAN_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    LIGHT_BLUE_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    BLUE_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    PURPLE_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    MAGENTA_WOOL,
    @Since("1.19.70-r1")
    @PowerNukkitXOnly
    PINK_WOOL,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    OAK_FENCE,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    SPRUCE_FENCE,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    BIRCH_FENCE,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    JUNGLE_FENCE,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    ACACIA_FENCE,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    DARK_OAK_FENCE,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    OAK_LOG,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    SPRUCE_LOG,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    BIRCH_LOG,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    JUNGLE_LOG,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    ACACIA_LOG,
    @Since("1.19.80-r1")
    @PowerNukkitXOnly
    DARK_OAK_LOG,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    WHITE_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    ORANGE_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    MAGENTA_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    LIGHT_BLUE_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    YELLOW_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    LIME_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    PINK_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    GRAY_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    LIGHT_GRAY_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CYAN_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    PURPLE_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    BLUE_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    BROWN_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    GREEN_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    RED_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    BLACK_CARPET,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    TUBE_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    BRAIN_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    BUBBLE_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    FIRE_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    HORN_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    DEAD_TUBE_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    DEAD_BRAIN_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    DEAD_BUBBLE_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    DEAD_FIRE_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    DEAD_HORN_CORAL,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_BUTTON,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_DOOR,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_FENCE,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_FENCE_GATE,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_HANGING_SIGN,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    STRIPPED_CHERRY_LOG,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_LOG,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_PLANKS,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_PRESSURE_PLATE,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_SLAB,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_DOUBLE_SLAB,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_STAIRS,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_STANDING_SIGN,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_TRAPDOOR,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_WALL_SIGN,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    STRIPPED_CHERRY_WOOD,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_WOOD,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_SAPLING,
    @Since("1.20.0-r1")
    @PowerNukkitXOnly
    CHERRY_LEAVES;


    private static final Map<String, MinecraftItemID> namespacedIdMap = Arrays.stream(values())
            .flatMap(id ->
                    Stream.concat(Arrays.stream(id.aliases), Stream.of(id.getNamespacedId()))
                            .map(ns -> new AbstractMap.SimpleEntry<>(ns, id)))
            .collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(), AbstractMap.SimpleEntry::getValue));

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    @Nullable
    public static MinecraftItemID getByNamespaceId(String namespacedId) {
        return namespacedIdMap.get(namespacedId);
    }

    private final String namespacedId;
    private final String itemFormNamespaceId;
    private final boolean technical;
    private final boolean edu;
    private final String[] aliases;

    MinecraftItemID(String namespacedId, String itemFormNamespaceId, String[] aliases) {
        this.namespacedId = namespacedId;
        this.itemFormNamespaceId = itemFormNamespaceId;
        technical = false;
        edu = false;
        this.aliases = aliases;
    }

    MinecraftItemID() {
        namespacedId = "minecraft:" + name().toLowerCase();
        itemFormNamespaceId = namespacedId;
        technical = false;
        edu = false;
        aliases = EmptyArrays.EMPTY_STRINGS;
    }

    MinecraftItemID(boolean blockForm) {
        this(blockForm, false);
    }

    MinecraftItemID(boolean blockForm, boolean technical) {
        this(blockForm, technical, false);
    }

    MinecraftItemID(boolean blockForm, boolean technical, boolean edu) {
        this.technical = technical;
        this.edu = edu;
        String namespacedId = name().toLowerCase();
        aliases = EmptyArrays.EMPTY_STRINGS;
        itemFormNamespaceId = "minecraft:" + namespacedId;
        if (blockForm) {
            this.namespacedId = "minecraft:item." + namespacedId;
        } else {
            this.namespacedId = itemFormNamespaceId;
        }
    }

    MinecraftItemID(String namespacedId, String itemFormNamespaceId) {
        this(namespacedId, itemFormNamespaceId, false);
    }

    MinecraftItemID(String namespacedId, String itemFormNamespaceId, boolean technical) {
        this(namespacedId, itemFormNamespaceId, technical, false);
    }

    MinecraftItemID(String namespacedId, String itemFormNamespaceId, boolean technical, boolean edu) {
        this.edu = edu;
        this.technical = technical;
        this.namespacedId = namespacedId;
        this.itemFormNamespaceId = itemFormNamespaceId;
        aliases = EmptyArrays.EMPTY_STRINGS;
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public Item get(int amount) {
        return RuntimeItems.getRuntimeMapping().getItemByNamespaceId(getItemFormNamespaceId(), amount);
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public Item get(int amount, byte[] compoundTag) {
        Item item = get(amount);
        item.setCompoundTag(compoundTag != null ? compoundTag.clone() : null);
        return item;
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public String getItemFormNamespaceId() {
        return itemFormNamespaceId;
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public String getNamespacedId() {
        return namespacedId;
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public boolean isTechnical() {
        return technical;
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public boolean isEducationEdition() {
        return edu;
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public String[] getAliases() {
        return aliases.length == 0 ? aliases : aliases.clone();
    }
}
