FROM debian:bookworm

RUN apt-get update && apt-get upgrade -y && apt-get install -y  \
	git-all \
	default-jre \
	maven \
	zsh \
	curl \
	neofetch \
	make \
	python3 \
	python3-pip
	# jupyter
	# python3.11-venv
	# flatpak \


# RUN python3 -m venv path/to/venv.


WORKDIR /swingy

RUN sh -c "$(curl -fsSL https://raw.github.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"

RUN echo 'alias clean="clear; neofetch"' >> ~/.zshrc && source ~/.zshrc

CMD ["tail", "-f", "/dev/null"]