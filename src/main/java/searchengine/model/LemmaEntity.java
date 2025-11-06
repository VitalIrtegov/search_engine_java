package searchengine.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "lemma")
@Getter
@Setter
public class LemmaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_id", nullable = false)
    private SiteEntity site;

    @Column(nullable = false, length = 255)
    private String lemma;

    @Column(nullable = false)
    private Integer frequency;
}
