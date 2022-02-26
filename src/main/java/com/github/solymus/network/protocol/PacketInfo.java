package com.github.solymus.network.protocol;

import java.util.Arrays;
import java.util.List;

public interface PacketInfo {

  int CURRENT_PROTOCOL = 486;
  List<Integer> SUPPORTED_PROTOCOLS = Arrays.asList(CURRENT_PROTOCOL);
  String MINECRAFT_VERSION = "v1.18.10", MINECRAFT_VERSION_NETWORK = "1.18.10";

  int LOGIN_PACKET = 0x01, PLAY_STATUS_PACKET = 0x02, SERVER_TO_CLIENT_PACKET = 0x03, CLIENT_TO_SERVER_PACKET = 0x04,
      DISCONNECT_PACKET = 0x05, RESOURCE_PACK_INFO_PACKET = 0x06, RESOURCE_PACK_STACK_PACKET = 0x07,
      RESOURCE_PACK_RESPONSE_PACKET = 0x08, TEXT_PACKET = 0x09, SET_TIME_PACKET = 0x0A, START_GAME_PACKET = 0x0B,
      ADD_PLAYER_PACKET = 0x0C, ADD_ENTITY_PACKET = 0x0D, REMOVE_ENTITY_PACKET = 0x0E, ADD_ITEM_ENTITY_PACKET = 0x0F,
      TAKE_ITEM_ENTITY_PACKET = 0x11, MOVE_ENTITY_ABSOLUTE = 0x12, MOVE_PLAYER_PACKET = 0x13, RIDER_JUMP_PACKET = 0x14,
      UPDATE_BLOCK_PACKET = 0x15, ADD_PAINTING_PACKET = 0x16, TICK_SYNC_PACKET = 0x17, LEVEL_SOUND_EVENT_PACKET = 0x18,
      LEVEL_EVENT_PACKET = 0x19, BLOCK_EVENT_PACKET = 0x1A, ENTITY_EVENT_PACKET = 0x1B, MOB_EFFECT_PACKET = 0x1C,
      UPDATE_ATTRIBUTES_PACKET = 0x1D, INVENTORY_TRANSACTION_PACKET = 0x1E, MOB_EQUIPMENT_PACKET = 0x1F,
      MOB_ARMOR_EQUIPMENT_PACKET = 0x20, INTERACT_PACKET = 0x21, BLOCK_PICK_REQUEST_PACKET = 0x22,
      ENTITY_PICK_REQUEST_PACKET = 0x23, PLAYER_ACTION_PACKET = 0x24, ENTITY_FALL_PACKET = 0x25,
      HURT_ARMOR_PACKET = 0x26, SET_ENTITY_DATA_PACKET = 0x27, SET_ENTITY_MOTION_PACKET = 0x28,
      SET_ENTITY_LINK_PACKET = 0x29, SET_HEALTH_PACKET = 0x2A, SET_SPAWN_POSITION_PACKET = 0x2B, ANIMATE_PACKET = 0x2C,
      RESPAWN_PACKET = 0x2D, CONTAINER_OPEN_PACKET = 0x2E, CONTAINER_CLOSE_PACKET = 0x2F, PLAYER_HOTBAR_PACKET = 0x30,
      INVENTORY_CONTENT_PACKET = 0x31, INVENTORY_SLOT_PACKET = 0x32, CONTAINER_SET_DATA_PACKET = 0x33,
      CRAFTING_DATA_PACKET = 0x34, CRAFTING_EVENT_PACKET = 0x35, GUI_DATA_PICK_ITEM_PACKET = 0x36,
      ADVENTURE_SETTINGS_PACKET = 0x37, BLOCK_ENTITY_DATA_PACKET = 0x38, PLAYER_INPUT_PACKET = 0x39,
      LEVEL_CHUNK_PACKET = 0x3A, SET_COMMANDS_ENABLED_PACKET = 0x3B, SET_DIFFICULTY_PACKET = 0x3C,
      CHANGE_DIMENSION_PACKET = 0x3D, SET_PLAYER_GAME_TYPE = 0x3E, PLAYER_LIST_PACKET = 0x3F,
      SIMPLE_EVENT_PACKET = 0x40, EVENT_PACKET = 0x41, SPAWN_EXPERIENCE_ORB_PACKET = 0x42, MAP_ITEM_DATA = 0x43,
      MAP_INFO_REQUEST = 0x44, REQUEST_CHUNK_RADIUS_PACKET = 0x45, CHUNK_RADIUS_UPDATE_PACKET = 0x46,
      ITEMFRAME_DROP_ITEM_PACKET = 0x47, GAME_RULES_CHANGED_PACKET = 0x48, CAMERA_PACKET = 0x49,
      BOSS_EVENT_PACKET = 0x4A, SHOW_CREDITS_PACKET = 0x4B, AVAILABLE_COMMANDS_PACKET = 0x4C,
      COMMAND_REQUEST_PACKET = 0x4D, COMMANDBLOCK_UPDATE_PACKET = 0x4E, COMMAND_OUTPUT_PACKET = 0x4F,
      UPDATE_TRADE_PACKET = 0x50, UPDATE_EQUIP_PACKET = 0x51, RESOURCE_PACK_DATA_INFO_PACKET = 0x52,
      RESOURCE_PACK_CHUNK_DATA_PACKET = 0x53, RESOURCE_PACK_CHUNK_REQUEST_PACKET = 0x54, TRANSFER_PACKET = 0x55,
      PLAY_SOUND_PACKET = 0x56, STOP_SOUND_PACKET = 0x57, SET_TITLE_PACKET = 0x58, ADD_BEHAVIOR_TREE_PACKET = 0x59,
      STRUCTURE_BLOCK_UPDATE_PACKET = 0x5A, SHOW_STORE_OFFER_PACKET = 0x5B, PURCHASE_RECEIPT_PACKET = 0x5C,
      PLAYER_SKIN_PACKET = 0x5D, SUB_CLIENT_LOGIN_PACKET = 0x5E, AUTOMATION_CLIENT_CONNECT_PACKET = 0x5F,
      SET_LAST_HURT_BY_PACKET = 0x60, BOOK_EDIT_PACKET = 0x61, NPC_REQUEST_PACKET = 0x62, PHOTO_TRANSFER_PACKET = 0x63,
      MODEL_FORM_REQUEST_PACKET = 0x64, MODEL_FORM_RESPONSE_PACKET = 0x65, SERVER_SETTINGS_REQUEST_PACKET = 0x66,
      SERVER_SETTINGS_RESPONSE_PACKET = 0x67, SHOW_PROFILE_PACKET = 0x68, SET_DEFAULT_GAME_TYPE_PACKET = 0x69,
      REMOVE_OBJECTIVE_PACKET = 0x6A, SET_DISPLAY_OBJECTIVE_PACKET = 0x6B, SET_SCORE_PACKET = 0x6C,
      LAB_TABLE_PACKET = 0x6D, UPDATE_BLOCK_SYNCED_PACKET = 0x6E, MOVE_ENTITY_DELTA_PACKET = 0x6F,
      SET_SCOREBOARD_IDENTITY_PACKET = 0x70, SET_LOCAL_PLAYER_AS_INITIALIZED_PACKET = 0x71,
      UPDATE_SOFT_ENUM_PACKET = 0x72, NETWORK_STACK_LATENCY_PACKET = 0x73, SCRIPT_CUSTOM_EVENT_PACKET = 0x75,
      SPAWN_PARTICLE_EFFECT_PACKET = 0x76, AVAILABLE_ENTITY_IDENTIFIERS_PACKET = 0x77,
      LEVEL_SOUND_EVENT_2_PACKET = 0x78, NETWORK_CHUNK_PUBLISHER_UPDATE_PACKET = 0x79,
      BIOME_DEFINITION_LIST_PACKET = 0x7A, LEVEL_SOUND_EVENT_3_PACKET = 0x7B, LEVEL_EVENT_GENERIC_PACKET = 0x7C,
      LECTERN_UPDATE_PACKET = 0x7D, VIDEO_STREAM_CONNECT_PACKET = 0x7E, CLIENT_CACHE_STATUS_PACKET = 0x81,
      ON_SCREEN_TEXTURE_ANIMATION_PACKET = 0x82, MAP_CREATE_LOCKED_COPY_PACKET = 0x83,
      STRUCTURE_TEMPLATE_DATA_EXPORT_REQUEST_PACKET = 0x84, STRUCTURE_TEMPLATE_DATA_EXPORT_RESPONSE_PACKET = 0x85,
      UPDATE_BLOCK_PROPERTIES_PACKET = 0x86, CLIENT_CACHE_BLOB_STATUS_PACKET = 0x87,
      CLIENT_CACHE_MISS_RESPONSE_PACKET = 0x88, NETWORK_SETTINGS_PACKET = 0x8F, PLAYER_AUTH_INPUT_PACKET = 0x90,
      CREATIVE_CONTENT_PACKET = 0x91, PLAYER_ENCHANT_OPTIONS_PACKET = 0x92, ITEM_STACK_REQUEST_PACKET = 0x93,
      ITEM_STACK_RESPONSE_PACKET = 0x94, PLAYER_ARMOR_DAMAGE_PACKET = 0x95, CODE_BUILDER_PACKET = 0x96,
      UPDATE_PLAYER_GAME_TYPE_PACKET = 0x97, EMOTE_LIST_PACKET = 0x98,
      POSITION_TRACKING_DB_SERVER_BROADCAST_PACKET = 0x99, POSITION_TRACKING_DB_CLIENT_REQUEST_PACKET = 0x9A,
      DEBUG_INFO_PACKET = 0x9B, PACKET_VIOLATION_WARNING_PACKET = 0x9C, ANIMATE_ENTITY_PACKET = 0x9E,
      ITEM_COMPONENT_PACKET = 0xA2, FILTER_TEXT_PACKET = 0xA3, CLIENTBOUND_DEBUG_RENDERER_PACKET = 0xA4,
      BATCH_PACKET = 0xFF;

}
