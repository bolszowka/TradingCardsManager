CREATE TABLE IF NOT EXISTS producers (
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  creation_date TIMESTAMP NOT NULL,
  modification_date TIMESTAMP NULL,
  version INT NOT NULL,
  uuid VARCHAR(36) NOT NULL
);

CREATE TABLE IF NOT EXISTS collections (
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  creation_date TIMESTAMP NOT NULL,
  modification_date TIMESTAMP NULL,
  version INT NOT NULL,
  uuid VARCHAR(36) NOT NULL,
  producer_id BIGINT,
  FOREIGN KEY (producer_id) REFERENCES producers (id)
);

CREATE TABLE IF NOT EXISTS cards (
  id BIGSERIAL PRIMARY KEY,
  number VARCHAR(10) NOT NULL,
  name VARCHAR(255) NOT NULL,
  club_country VARCHAR(255),
  type VARCHAR(255) NOT NULL,
  creation_date TIMESTAMP NOT NULL,
  modification_date TIMESTAMP NULL,
  version INT NOT NULL,
  uuid VARCHAR(36) NOT NULL,
  collection_id BIGINT,
  FOREIGN KEY (collection_id) REFERENCES collections (id)
);