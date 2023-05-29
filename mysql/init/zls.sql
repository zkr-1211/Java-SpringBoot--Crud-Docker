DROP DATABASE IF EXISTS `zls`;
CREATE DATABASE IF NOT EXISTS `zls` DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;
use `zls`;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户名',
  `age` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '年龄',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'xcrj1', '10');
INSERT INTO `user` VALUES (2, 'xcrj2', '11');
INSERT INTO `user` VALUES (3, 'xcrj3', '18');

SET FOREIGN_KEY_CHECKS = 1;

-- -- ----------------------------
-- -- Table structure for role
-- -- ----------------------------
-- DROP TABLE IF EXISTS `role`;
-- CREATE TABLE `role`  (
--   `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
--   `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '角色名',
--   `type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '类型',
--   PRIMARY KEY (`id`) USING BTREE
-- ) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- -- ----------------------------
-- -- Records of role
-- -- ----------------------------
-- INSERT INTO `role` VALUES (1, 'role2', '101');
-- INSERT INTO `role` VALUES (2, 'role3', '112');
-- INSERT INTO `role` VALUES (3, 'role4', '183');

-- SET FOREIGN_KEY_CHECKS = 1;