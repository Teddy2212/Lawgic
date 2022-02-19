ALTER TABLE chat
    ADD CONSTRAINT fk_delete_cascade
        FOREIGN KEY (lawyer_id, client_id, consult_id)
            REFERENCES chat(lawyer_id, client_id, consult_id)
            ON DELETE CASCADE;

