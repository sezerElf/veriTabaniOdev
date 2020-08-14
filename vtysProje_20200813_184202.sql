--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: calisma_sekli; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.calisma_sekli (
    id integer NOT NULL,
    calisma_sekli_adi character varying(255)
);


ALTER TABLE public.calisma_sekli OWNER TO postgres;

--
-- Name: danisman; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.danisman (
    id integer NOT NULL,
    kullanici_id integer
);


ALTER TABLE public.danisman OWNER TO postgres;

--
-- Name: egitim_durumu; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.egitim_durumu (
    id integer NOT NULL,
    egitim_durumu_adi character varying(255)
);


ALTER TABLE public.egitim_durumu OWNER TO postgres;

--
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- Name: ilan; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ilan (
    id integer NOT NULL,
    goruntulenme_sayisi integer,
    is_tanimi character varying(255),
    son_basvuru_tarihi timestamp without time zone,
    calisma_sekli_id integer,
    egitim_durumu_id integer,
    is_veren_id integer,
    is_yeri_turu_id integer,
    meslek_id integer,
    saglik_durumu_id integer,
    sehir_id integer,
    sektor_id integer
);


ALTER TABLE public.ilan OWNER TO postgres;

--
-- Name: ilan_adres; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ilan_adres (
    id integer NOT NULL,
    isim character varying(255),
    posta_kodu integer,
    ilan_id integer
);


ALTER TABLE public.ilan_adres OWNER TO postgres;

--
-- Name: is_arayan; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.is_arayan (
    id integer NOT NULL,
    kullanici_id integer
);


ALTER TABLE public.is_arayan OWNER TO postgres;

--
-- Name: is_veren; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.is_veren (
    id integer NOT NULL,
    kullanici_id integer
);


ALTER TABLE public.is_veren OWNER TO postgres;

--
-- Name: is_yeri_turu; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.is_yeri_turu (
    id integer NOT NULL,
    tur_adi character varying(255)
);


ALTER TABLE public.is_yeri_turu OWNER TO postgres;

--
-- Name: kullanici; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.kullanici (
    id integer NOT NULL,
    ad character varying(255),
    cinsiyet character varying(255),
    mail character varying(255),
    sifre character varying(255),
    soyad character varying(255),
    tcno character varying(255),
    yas integer NOT NULL,
    egitim_durumu_id integer,
    mesaj_id integer,
    meslek_id integer,
    saglik_durumu_id integer,
    sehir_id integer
);


ALTER TABLE public.kullanici OWNER TO postgres;

--
-- Name: kullanici_adres; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.kullanici_adres (
    id integer NOT NULL,
    isim character varying(255),
    kullanici_id integer
);


ALTER TABLE public.kullanici_adres OWNER TO postgres;

--
-- Name: mesaj; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.mesaj (
    id integer NOT NULL,
    icerik character varying(255)
);


ALTER TABLE public.mesaj OWNER TO postgres;

--
-- Name: meslek; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.meslek (
    id integer NOT NULL,
    meslek_adi character varying(255)
);


ALTER TABLE public.meslek OWNER TO postgres;

--
-- Name: saglik_durumu; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.saglik_durumu (
    id integer NOT NULL,
    kisisel_saglik_durum_adi character varying(255)
);


ALTER TABLE public.saglik_durumu OWNER TO postgres;

--
-- Name: sehir; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sehir (
    id integer NOT NULL,
    sehir_adi character varying(255)
);


ALTER TABLE public.sehir OWNER TO postgres;

--
-- Name: sektor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sektor (
    id integer NOT NULL,
    sektor_adi character varying(255)
);


ALTER TABLE public.sektor OWNER TO postgres;

--
-- Data for Name: calisma_sekli; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: danisman; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: egitim_durumu; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.egitim_durumu VALUES (1, 'İlkokul');


--
-- Data for Name: ilan; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: ilan_adres; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: is_arayan; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: is_veren; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.is_veren VALUES (23, 22);
INSERT INTO public.is_veren VALUES (25, 24);


--
-- Data for Name: is_yeri_turu; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: kullanici; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.kullanici VALUES (22, 'Merve', 'Erkek', 'sezermerve2259@gmail.com', '123', 'Sezer', '12424', 21, 1, NULL, 1, 1, 1);
INSERT INTO public.kullanici VALUES (24, 'Artun', 'Erkek', 'artuncolak97@gmail.com', '12345', 'Çolak', '21343', 23, 1, NULL, 1, 1, 1);


--
-- Data for Name: kullanici_adres; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: mesaj; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: meslek; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.meslek VALUES (1, 'Mühendis');


--
-- Data for Name: saglik_durumu; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.saglik_durumu VALUES (1, 'Engelsiz');
INSERT INTO public.saglik_durumu VALUES (2, 'Engelli');


--
-- Data for Name: sehir; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.sehir VALUES (1, 'Edirne');


--
-- Data for Name: sektor; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 25, true);


--
-- Name: calisma_sekli calisma_sekli_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.calisma_sekli
    ADD CONSTRAINT calisma_sekli_pkey PRIMARY KEY (id);


--
-- Name: danisman danisman_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.danisman
    ADD CONSTRAINT danisman_pkey PRIMARY KEY (id);


--
-- Name: egitim_durumu egitim_durumu_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.egitim_durumu
    ADD CONSTRAINT egitim_durumu_pkey PRIMARY KEY (id);


--
-- Name: ilan_adres ilan_adres_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan_adres
    ADD CONSTRAINT ilan_adres_pkey PRIMARY KEY (id);


--
-- Name: ilan ilan_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT ilan_pkey PRIMARY KEY (id);


--
-- Name: is_arayan is_arayan_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.is_arayan
    ADD CONSTRAINT is_arayan_pkey PRIMARY KEY (id);


--
-- Name: is_veren is_veren_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.is_veren
    ADD CONSTRAINT is_veren_pkey PRIMARY KEY (id);


--
-- Name: is_yeri_turu is_yeri_turu_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.is_yeri_turu
    ADD CONSTRAINT is_yeri_turu_pkey PRIMARY KEY (id);


--
-- Name: kullanici_adres kullanici_adres_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanici_adres
    ADD CONSTRAINT kullanici_adres_pkey PRIMARY KEY (id);


--
-- Name: kullanici kullanici_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanici
    ADD CONSTRAINT kullanici_pkey PRIMARY KEY (id);


--
-- Name: mesaj mesaj_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mesaj
    ADD CONSTRAINT mesaj_pkey PRIMARY KEY (id);


--
-- Name: meslek meslek_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.meslek
    ADD CONSTRAINT meslek_pkey PRIMARY KEY (id);


--
-- Name: saglik_durumu saglik_durumu_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.saglik_durumu
    ADD CONSTRAINT saglik_durumu_pkey PRIMARY KEY (id);


--
-- Name: sehir sehir_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sehir
    ADD CONSTRAINT sehir_pkey PRIMARY KEY (id);


--
-- Name: sektor sektor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sektor
    ADD CONSTRAINT sektor_pkey PRIMARY KEY (id);


--
-- Name: is_arayan fk3233he1j83crh325plilikxx2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.is_arayan
    ADD CONSTRAINT fk3233he1j83crh325plilikxx2 FOREIGN KEY (kullanici_id) REFERENCES public.kullanici(id);


--
-- Name: ilan fk4ewbgarpnhe2jsxms6n65uma0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT fk4ewbgarpnhe2jsxms6n65uma0 FOREIGN KEY (sektor_id) REFERENCES public.sektor(id);


--
-- Name: is_veren fk52syyxm3v39w7rgimd9htvm22; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.is_veren
    ADD CONSTRAINT fk52syyxm3v39w7rgimd9htvm22 FOREIGN KEY (kullanici_id) REFERENCES public.kullanici(id);


--
-- Name: ilan fk57t4iiv27owotuowvi4xte9n; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT fk57t4iiv27owotuowvi4xte9n FOREIGN KEY (is_yeri_turu_id) REFERENCES public.is_yeri_turu(id);


--
-- Name: danisman fk7jlol2dxmvfabc83gaw2f3mye; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.danisman
    ADD CONSTRAINT fk7jlol2dxmvfabc83gaw2f3mye FOREIGN KEY (kullanici_id) REFERENCES public.kullanici(id);


--
-- Name: kullanici fk7mwe5qvruonbnw4ll3osv37k; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanici
    ADD CONSTRAINT fk7mwe5qvruonbnw4ll3osv37k FOREIGN KEY (meslek_id) REFERENCES public.meslek(id);


--
-- Name: kullanici fk96ujsfqtn5v1ekwx8q9mpthbn; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanici
    ADD CONSTRAINT fk96ujsfqtn5v1ekwx8q9mpthbn FOREIGN KEY (saglik_durumu_id) REFERENCES public.saglik_durumu(id);


--
-- Name: ilan fk9vquydhs3lwpvvn01xqb6dj5v; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT fk9vquydhs3lwpvvn01xqb6dj5v FOREIGN KEY (sehir_id) REFERENCES public.sehir(id);


--
-- Name: kullanici fka9xry3gdxfsehwy8u8lxl07so; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanici
    ADD CONSTRAINT fka9xry3gdxfsehwy8u8lxl07so FOREIGN KEY (egitim_durumu_id) REFERENCES public.egitim_durumu(id);


--
-- Name: ilan fkav86e64db323i2xe8gysvhcfq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT fkav86e64db323i2xe8gysvhcfq FOREIGN KEY (egitim_durumu_id) REFERENCES public.egitim_durumu(id);


--
-- Name: ilan fkd0omyhckqii1y76uvurnievdc; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT fkd0omyhckqii1y76uvurnievdc FOREIGN KEY (calisma_sekli_id) REFERENCES public.calisma_sekli(id);


--
-- Name: ilan fkdp5rrt3ugmyc2j4drfacypco8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT fkdp5rrt3ugmyc2j4drfacypco8 FOREIGN KEY (saglik_durumu_id) REFERENCES public.saglik_durumu(id);


--
-- Name: kullanici_adres fkiq2ty828981dit10bk53otd39; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanici_adres
    ADD CONSTRAINT fkiq2ty828981dit10bk53otd39 FOREIGN KEY (kullanici_id) REFERENCES public.kullanici(id);


--
-- Name: kullanici fkkp441ys1ugpbxc7l0amctqxs5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanici
    ADD CONSTRAINT fkkp441ys1ugpbxc7l0amctqxs5 FOREIGN KEY (mesaj_id) REFERENCES public.mesaj(id);


--
-- Name: kullanici fkl1iwquhy24r19voenpdwyvfny; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanici
    ADD CONSTRAINT fkl1iwquhy24r19voenpdwyvfny FOREIGN KEY (sehir_id) REFERENCES public.sehir(id);


--
-- Name: ilan fkl81lhvwgiuote2jxtpufyebxq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT fkl81lhvwgiuote2jxtpufyebxq FOREIGN KEY (meslek_id) REFERENCES public.meslek(id);


--
-- Name: ilan fkphikswxlxf3fdit3n5did2ose; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan
    ADD CONSTRAINT fkphikswxlxf3fdit3n5did2ose FOREIGN KEY (is_veren_id) REFERENCES public.is_veren(id);


--
-- Name: ilan_adres fkrm63aeh0olt0ykn89rda95xaj; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ilan_adres
    ADD CONSTRAINT fkrm63aeh0olt0ykn89rda95xaj FOREIGN KEY (ilan_id) REFERENCES public.ilan(id);


--
-- PostgreSQL database dump complete
--

